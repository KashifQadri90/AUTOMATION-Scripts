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

//for (def rowNum=1; rowNum<=findtestdata("DATA11").getRowNumbers() ; rowNum++)
//Mobile.tap(findTestObject('Login Auth/android.widget.TextView4 - Sign in as different user'), 0)
//Mobile.setText(findTestObject('Login Auth/android.widget.EditText0 - User ID'), 'iqranazir', 0)
//Mobile.setText(findTestObject('otp object/android.widget.EditText0 - User ID'), Username, 2)
//Mobile.setText(findTestObject('otp object/android.widget.EditText1 - Password'), Password, 2)
//Mobile.setText(findTestObject('Login Auth/android.widget.EditText0 - User ID'), findTestData(DATA11).getRowNumbers(1,rowNum))
//Mobile.setText(findTestObject('Login Auth/android.widget.EditText1 - Password'), findTestData(DATA11).getRowNumbers(1,rowNum))
Mobile.setText(findTestObject('Login Auth/android.widget.EditText0 - User ID'), findTestData(Office Staging).getRowNumbers(1, 2), 
    2)

Mobile.setText(findTestObject('Login Auth/android.widget.EditText1 - Password'), findTestData(Office Staging).getRowNumbers(2, 2), 
    2)

Mobile.tap(findTestObject('Login Auth/android.widget.Button0 - Login'), 0)

Mobile.tap(findTestObject('Account Summary on Navigational Drawer/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Account Summary on Navigational Drawer/android.widget.TextView30 - Logout'), 0)

