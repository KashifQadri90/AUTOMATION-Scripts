import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

Mobile.startApplication('C:\\Users\\Kashif\\Downloads\\staging.apk', true)

//Mobile.unlockScreen()
Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

//Mobile.toggleAirplaneMode()
Mobile.tap(findTestObject('first/android.widget.Button0 - Login (2)'), 0)

Mobile.setText(findTestObject('otp object/android.widget.EditText0 - User ID'), 'customer', 0)

Mobile.setText(findTestObject('otp object/android.widget.EditText1 - Password'), 'admin@123', 0)

Mobile.tap(findTestObject('first/android.widget.Button0 - Login'), 0)

Mobile.tap(findTestObject('Account Summary on Navigational Drawer/android.widget.ImageView0'), 0)

//Mobile.tap(findTestObject('KYC DOC/android.widget.ImageView0'), 0)
Mobile.tap(findTestObject('KYC DOC/android.widget.ImageView5'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.openNotifications()

Mobile.tap(findTestObject('Reply/android.widget.Button0 - Reply'), 2)

Mobile.setText(findTestObject('Set text edit/android.widget.EditText0 - Reply'), 'Asalam u Alikum Usama Brother', 0)

Mobile.tap(findTestObject('Uparrow/android.widget.ImageButton0'), 2)

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

Mobile.closeNotifications()

//================Mobile.tap(findTestObject('KYC DOC/android.widget.ImageView0'), 0)
//=====================Mobile.tap(findTestObject('KYC DOC/android.widget.ImageView5'), 0)
Mobile.tap(findTestObject('KYC DOC/android.widget.TextView15 - Upload'), 0)

Mobile.tap(findTestObject('KYC DOC/android.widget.TextView1 - Camera'), 0)

Mobile.tap(findTestObject('KYC DOC/android.widget.Button0 - Start'), 0)

Mobile.tap(findTestObject('KYC DOC/android.widget.Button0 - Capture (1)'), 0)

Mobile.tap(findTestObject('KYC DOC/android.widget.TextView1 - OK'), 0)

Mobile.tap(findTestObject('KYC DOC/android.widget.Button0 - Capture (1)'), 0)

Mobile.tap(findTestObject('KYC DOC/android.widget.TextView1 - OK'), 0)

Mobile.tap(findTestObject('KYC DOC/android.widget.Button0 - Capture (1)'), 0)

Mobile.waitForElementPresent(findTestObject('KYC DOC/android.widget.TextView1 - OK'), 0)

Mobile.tap(findTestObject('KYC DOC/android.widget.TextView1 - OK'), 0)

Mobile.tap(findTestObject('KYC DOC/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('Account Summary on Navigational Drawer/android.widget.TextView30 - Logout'), 0)

