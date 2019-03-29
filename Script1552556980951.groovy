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

Mobile.startApplication('C:\\Users\\Kashif\\Downloads\\staging.apk', true)
Mobile.tap(findTestObject('first/android.widget.Button0 - Login (2)'), 0)

Mobile.setText(findTestObject('otp object/android.widget.EditText0 - User ID'), 'customer', 0)

Mobile.setText(findTestObject('otp object/android.widget.EditText1 - Password'), 'Customer@1', 0)



Mobile.tap(findTestObject('first/android.widget.Button0 - Login'), 0)

Mobile.tap(findTestObject('Account Summary on Navigational Drawer/android.widget.ImageView0'), 0)

//Mobile.tap(findTestObject('KYC DOC/android.widget.ImageView0'), 0)
Mobile.tap(findTestObject('KYC DOC/android.widget.ImageView5'), 0)


Mobile.tap(findTestObject('KYC DOC/android.widget.ImageView3'), 0)

Mobile.setText(findTestObject('KYC DOC/android.widget.EditText0 (5)'), 'skrrrradri90@gmail.com', 0)

Mobile.tap(findTestObject('KYC DOC/android.widget.Button0 - Next'), 0)

Mobile.setText(findTestObject('KYC DOC/android.widget.EditText0 (6)'), 'skrrrradri90@gmail.com', 0)

Mobile.tap(findTestObject('KYC DOC/android.widget.Button0 - Confirm'), 0)

//Mobile.setText(findTestObject('KYC DOC/android.widget.EditText0 (7)'), '615997', 0)
//Mobile.tap(findTestObject('KYC DOC/android.widget.TextView1 - OK'), 0)
Response1 = WS.sendRequest(findTestObject('OTP', [('OTP ') : GlobalVariable.OTPGV]))

def slurper1 = new groovy.json.JsonSlurper()

def result1 = slurper1.parseText(Response1.getResponseBodyContent())

def value1 = result1.data.pin

Mobile.setText(findTestObject('otp object/android.widget.EditText0 (1)'), value1, 0)

Mobile.tap(findTestObject('KYC DOC/android.widget.TextView1 - OK (1)'), 0)


Mobile.tap(findTestObject('KYC DOC/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('Account Summary on Navigational Drawer/android.widget.TextView30 - Logout'), 0)

