import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('C:\\Users\\Kashif\\Downloads\\kashif13032019.apk', true)

Mobile.tap(findTestObject('first/android.widget.Button0 - Login (2)'), 0)

//Mobile.tap(findTestObject('Login Auth/android.widget.TextView4 - Sign in as different user'), 0)
Mobile.setText(findTestObject('Login Auth/android.widget.EditText0 - User ID'), 'iqranazir', 0)

Mobile.setText(findTestObject('Login Auth/android.widget.EditText1 - Password'), 'admin@123', 0)

Mobile.tap(findTestObject('Login Auth/android.widget.Button0 - Login'), 0)

Mobile.tap(findTestObject('Login Auth/android.widget.TextView1 - OK'), 0)

Mobile.tap(findTestObject('Login Auth/android.widget.ImageButton0'), 0)

Mobile.clearText(findTestObject('Login Auth/android.widget.EditText1 - admin123'), 0)

Mobile.setText(findTestObject('Login Auth/android.widget.EditText1 - Password (1)'), 'Admin@121', 0)

Mobile.tap(findTestObject('Login Auth/android.widget.Button0 - Login'), 0)

Mobile.tap(findTestObject('Login Auth/android.widget.TextView1 - OK'), 0)

Mobile.clearText(findTestObject('Login Auth/android.widget.EditText1 - Admin121'), 0)

Mobile.setText(findTestObject('Login Auth/android.widget.EditText1 - Password (1)'), 'Admin#123', 0)

Mobile.tap(findTestObject('Login Auth/android.widget.Button0 - Login'), 0)

Mobile.tap(findTestObject('Login Auth/android.widget.TextView1 - OK'), 0)

Mobile.clearText(findTestObject('Login Auth/android.widget.EditText1 - Admin123 (1)'), 0)

Mobile.setText(findTestObject('Login Auth/android.widget.EditText1 - Password (1)'), 'Admin@123', 0)

Mobile.tap(findTestObject('Login Auth/android.widget.Button0 - Login'), 0)

Mobile.tap(findTestObject('Login Auth/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Account Summary on Navigational Drawer/android.widget.TextView30 - Logout'), 0)

Mobile.tap(findTestObject('Login Auth/android.widget.TextView4 - Sign in as different user'), 0)

Mobile.setText(findTestObject('Login Auth/android.widget.EditText0 - User ID'), 'testuser', 0)

Mobile.setText(findTestObject('Login Auth/android.widget.EditText1 - Password'), 'Admin@123', 0)

Mobile.tap(findTestObject('Login Auth/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('Login Auth/android.widget.Button0 - Login'), 0)

Mobile.tap(findTestObject('Login Auth/android.widget.TextView1 - OK'), 0)

Mobile.clearText(findTestObject('Login Auth/android.widget.EditText1 - Admin123 (2)'), 0)

Mobile.setText(findTestObject('Login Auth/android.widget.EditText1 - Password (1)'), 'admin@123', 0)

Mobile.tap(findTestObject('Login Auth/android.widget.Button0 - Login'), 0)

Mobile.tap(findTestObject('Login Auth/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Account Summary on Navigational Drawer/android.widget.TextView30 - Logout'), 0)

Mobile.setText(findTestObject('Login Auth/android.widget.EditText0 - Password'), 'Admin#123', 0)

Mobile.tap(findTestObject('Login Auth/android.widget.ImageButton0 (1)'), 0)

Mobile.tap(findTestObject('Login Auth/android.widget.Button0 - Login (1)'), 0)

Mobile.tap(findTestObject('Login Auth/android.widget.TextView1 - OK'), 0)

Mobile.clearText(findTestObject('Login Auth/android.widget.EditText0 - Admin123'), 0)

Mobile.setText(findTestObject('Login Auth/android.widget.EditText0 - Password (1)'), 'admin@121', 0)

Mobile.tap(findTestObject('Login Auth/android.widget.Button0 - Login (1)'), 0)

Mobile.tap(findTestObject('Login Auth/android.widget.TextView1 - OK'), 0)

Mobile.clearText(findTestObject('Login Auth/android.widget.EditText0 - admin121'), 0)

Mobile.setText(findTestObject('Login Auth/android.widget.EditText0 - Password (1)'), 'admin#123', 0)

Mobile.tap(findTestObject('Login Auth/android.widget.Button0 - Login (1)'), 0)

Mobile.tap(findTestObject('Login Auth/android.widget.TextView1 - OK'), 0)

Mobile.clearText(findTestObject('Login Auth/android.widget.EditText0 - admin123 (1)'), 0)

Mobile.setText(findTestObject('Login Auth/android.widget.EditText0 - Password (1)'), 'admin@123', 0)

Mobile.tap(findTestObject('Login Auth/android.widget.Button0 - Login (1)'), 0)

Mobile.tap(findTestObject('Login Auth/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Account Summary on Navigational Drawer/android.widget.TextView30 - Logout'), 0)

Mobile.setText(findTestObject('Login Auth/android.widget.EditText0 - Password'), 'Admin@123', 0)

Mobile.tap(findTestObject('Login Auth/android.widget.ImageButton0 (1)'), 0)

Mobile.tap(findTestObject('Login Auth/android.widget.Button0 - Login (1)'), 0)

Mobile.tap(findTestObject('Login Auth/android.widget.TextView1 - OK'), 0)

Mobile.clearText(findTestObject('Login Auth/android.widget.EditText0 - Admin123 (2)'), 0)

Mobile.setText(findTestObject('Login Auth/android.widget.EditText0 - Password (1)'), 'admin@123', 0)

Mobile.tap(findTestObject('Login Auth/android.widget.Button0 - Login (1)'), 0)

not_run: Mobile.tap(findTestObject('Login Auth/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Login Auth/android.widget.ImageView0'), 0)

not_run: Mobile.tap(findTestObject('Login Auth/android.widget.LinearLayout26'), 0)

Mobile.tap(findTestObject('Account Summary on Navigational Drawer/android.widget.TextView30 - Logout'), 0)

Mobile.tap(findTestObject('Login Auth/android.widget.TextView4 - Sign in as different user'), 0)

Mobile.closeApplication()

