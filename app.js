require('dotenv').config()
const express = require('express')
const path = require('path')
const logger = require('morgan')
const cookieParser = require('cookie-parser')
const session = require('express-session')
const socketio = require('socket.io')
const passport = require('passport')
const flash = require('connect-flash')
const i18n = require('i18n')
let bodyParser = require('body-parser')
let app = express()
app.io = socketio()
app.io.sockets.setMaxListeners(0)
app.use(bodyParser.json({
  limit: '10000kb'
}))

// view engine setup
app.set('views', path.join(__dirname, 'views'))
app.engine('hjs', require('hogan-express'))
app.set('view engine', 'hjs')
app.set('layout', 'master')
//let schedulerFunction = require('./utils/scheduler')
//schedulerFunction.schedulerFunction()
app.use(logger('dev'))
app.use(express.json())
app.use(express.urlencoded({
  extended: false
}))
app.use(cookieParser())
app.use(express.static(path.join(__dirname, 'public')))
i18n.configure({
    // define how many languages we would support in our application
  Languages: ['english', 'urdu', 'arabic', 'hindi', 'malayalam', 'tamil', 'bengali', 'philippines'],
    // define the path to language json files, default is /locales
  directory: __dirname + '/Languages/i18n',
    // define the default language
  defaultLocale: 'english',
    // define a custom cookie name to parse locale settings from
  cookie: 'i18n'
})

app.use(session({
  secret: 'financeHouseApi',
  saveUninitialized: true,
  resave: true
}))
app.use(i18n.init)
// Passport Authentication
app.use(passport.initialize())
app.use(passport.session())

app.use(flash())

//local languages
app.use('/language', require('./routes/web/languages'))

//system users(include web customer)
app.use('/', require('./routes/web'))
//api
app.use('/v1', require('./routes/paydayApi/v1'))

app.get('/pageNotFound', function (req, res) {
  res.status(404)
  res.render('404', {
    user: req.user,
    error: {},
    layout: 'loginMaster'
  })
})
app.get('/loginFail', function (req, res) {
  res.status(403).json({
    message: 'Invalid username/password'
  })
})
// catch 404 and forward to error handler
app.use(function (req, res, next) {
  if (req.user) {
    res.status(404)
    res.render('404', {
      user: req.user,
      error: {},
      layout: 'loginMaster'
    })
  }
})

// // catch 404 and forward to error handler
// app.use(function(req, res, next) {
//   next(createError(404));
// });

// error handler
app.use(function (err, req, res, next) {
    // set locals, only providing error in development
  res.locals.message = err.message
  res.locals.error = req.app.get('env') === 'development' ? err : {}
    // render the error page
  res.status(err.status || 500)
  res.render('error', {
    message: err.message,
    error: {},
    layout: 'loginMaster'
  })
})

module.exports = app
