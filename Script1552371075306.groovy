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

Mobile.tap(findTestObject('Add beneficiary/android.widget.Button0 - Login'), 0)

Mobile.tap(findTestObject('Add beneficiary/android.widget.EditText0 - User ID'), 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Add beneficiary/android.widget.EditText0 - User ID'), 'iqranazir', 0)

Mobile.setText(findTestObject('Add beneficiary/android.widget.EditText1 - Password'), 'Admin@123', 0)

Mobile.tap(findTestObject('Add beneficiary/android.widget.Button0 - Login (1)'), 0)

Mobile.tap(findTestObject('Add beneficiary/android.widget.ImageView2'), 0)

Mobile.tap(findTestObject('Add beneficiary/android.widget.ImageView3'), 0)

Mobile.tap(findTestObject('Add beneficiary/android.widget.TextView13 - Transfers'), 0)

Mobile.tap(findTestObject('Add beneficiary/android.widget.TextView4 - Add Beneficiary'), 0)

Mobile.tap(findTestObject('Add beneficiary/android.widget.TextView2 - Payday to Payday'), 0)

Mobile.setText(findTestObject('Add beneficiary/android.widget.EditText0'), '0551492885', 0)

Mobile.tap(findTestObject('Add beneficiary/android.widget.ImageView2 (1)'), 0)

Mobile.tap(findTestObject('Add beneficiary/android.widget.Button0 - Confirm'), 0)

Mobile.setText(findTestObject('Add beneficiary/android.widget.EditText0 (1)'), '988131', 0)

Mobile.tap(findTestObject('Add beneficiary/android.widget.TextView1 - OK'), 0)

Mobile.tap(findTestObject('Add beneficiary/android.widget.TextView5 - Resend OTP'), 0)

Mobile.tap(findTestObject('Add beneficiary/android.widget.TextView1 - OK (1)'), 0)

Mobile.setText(findTestObject('Add beneficiary/android.widget.EditText0 (1)'), '722086', 0)

Mobile.tap(findTestObject('Add beneficiary/android.widget.TextView5 - Resend OTP'), 0)

Mobile.tap(findTestObject('Add beneficiary/android.widget.TextView1 - OK (1)'), 0)

Mobile.setText(findTestObject('Add beneficiary/android.widget.EditText0 (1)'), '243362', 0)

Mobile.tap(findTestObject('Add beneficiary/android.widget.TextView1 - OK (1)'), 0)

Mobile.tap(findTestObject('Add beneficiary/android.widget.TextView4 - Add Beneficiary'), 0)

Mobile.tap(findTestObject('Add beneficiary/android.widget.TextView2 - Payday to Payday'), 0)

Mobile.setText(findTestObject('Add beneficiary/android.widget.EditText0'), '0553398146', 0)

Mobile.tap(findTestObject('Add beneficiary/android.widget.ImageView2 (1)'), 0)

Mobile.tap(findTestObject('Add beneficiary/android.widget.Button0 - Confirm'), 0)

Mobile.setText(findTestObject('Add beneficiary/android.widget.EditText0 (1)'), '941071', 0)

Mobile.tap(findTestObject('Add beneficiary/android.widget.TextView1 - OK (1)'), 0)

Mobile.tap(findTestObject('Add beneficiary/android.widget.TextView4 - Add Beneficiary'), 0)

Mobile.tap(findTestObject('Add beneficiary/android.widget.TextView2 - Payday to Payday'), 0)

Mobile.setText(findTestObject('Add beneficiary/android.widget.EditText0'), '0588901690', 0)

Mobile.tap(findTestObject('Add beneficiary/android.widget.ImageView2 (1)'), 0)

Mobile.tap(findTestObject('Add beneficiary/android.widget.Button0 - Confirm'), 0)

Mobile.setText(findTestObject('Add beneficiary/android.widget.EditText0 (1)'), '412754', 0)

Mobile.tap(findTestObject('Add beneficiary/android.widget.TextView1 - OK (2)'), 0)

Mobile.tap(findTestObject('Add beneficiary/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Add beneficiary/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Add beneficiary/android.widget.ImageView0'), 0)

Mobile.closeApplication()

