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

Mobile.startApplication('C:\\Users\\Kashif\\Downloads\\Payday02March-release.apk', true)

Mobile.tap(findTestObject('contact us/android.widget.TextView3 - Forgot User ID or Password'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('contact us/android.widget.TextView4 - Sign in as different user'), 0)

Mobile.setText(findTestObject('contact us/android.widget.EditText0 - User ID. Editing.'), 'customer', 0)

Mobile.setText(findTestObject('contact us/android.widget.EditText1 - Enter password.. Double tap to edit.'), 'admin@123', 
    0)

Mobile.tap(findTestObject('contact us/android.widget.Button0 - Login'), 0)

Mobile.setText(findTestObject('contact us/android.widget.EditText0 - User ID. customer. Double tap to edit.'), 'kashifqadri', 
    0)

Mobile.setText(findTestObject('contact us/android.widget.EditText1 - Enter password.. 9 Characters.. Double tap to edit.'), 
    'admin@3014', 0)

Mobile.tap(findTestObject('contact us/android.widget.Button0 - Login'), 0)

Mobile.tap(findTestObject('contact us/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('contact us/android.widget.TextView28 - Contact Us'), 0)

Mobile.tap(findTestObject('contact us/android.widget.ImageView1'), 0)

Mobile.tap(findTestObject('contact us/android.widget.TextView2 - Area of Issue'), 0)

Mobile.tap(findTestObject('contact us/android.widget.TextView1 - Payday Card Issues'), 0)

Mobile.tap(findTestObject('contact us/android.widget.TextView3 - Select Issue'), 0)

Mobile.tap(findTestObject('contact us/android.widget.TextView1 - Mobile number is not updated in system'), 0)

Mobile.setText(findTestObject('contact us/android.widget.EditText0 - Editing.'), 'automation going on', 0)

Mobile.tap(findTestObject('contact us/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('contact us/android.widget.ImageView1'), 0)

Mobile.tap(findTestObject('contact us/android.widget.TextView2 - Area of Issue'), 0)

Mobile.tap(findTestObject('contact us/android.widget.TextView1 - Payday Card Issues'), 0)

Mobile.tap(findTestObject('contact us/android.widget.TextView3 - Select Issue'), 0)

Mobile.tap(findTestObject('contact us/android.widget.TextView1 - Mobile number is not updated in system'), 0)

Mobile.setText(findTestObject('contact us/android.widget.EditText0 - Editing.'), 'automation going on', 0)

Mobile.tap(findTestObject('contact us/android.widget.Button0 - Send'), 0)

Mobile.tap(findTestObject('contact us/android.widget.Button0 - Send'), 0)

Mobile.tap(findTestObject('contact us/android.widget.TextView1 - Help'), 0)

Mobile.tap(findTestObject('contact us/android.widget.Button0 - Send'), 0)

Mobile.tap(findTestObject('contact us/android.widget.TextView1 - OK'), 0)

Mobile.tap(findTestObject('contact us/android.widget.TextView3 - Sent Box'), 0)

Mobile.tap(findTestObject('contact us/android.widget.ImageView1'), 0)

Mobile.tap(findTestObject('contact us/android.widget.TextView2 - Area of Issue'), 0)

Mobile.tap(findTestObject('contact us/android.widget.TextView2 - Payday Loan Issues'), 0)

Mobile.tap(findTestObject('contact us/android.widget.TextView3 - Select Issue'), 0)

Mobile.tap(findTestObject('contact us/android.widget.TextView6 - Change of tenure for top up loan without'), 0)

Mobile.setText(findTestObject('contact us/android.widget.EditText0 - Editing.'), 'hi', 0)

Mobile.tap(findTestObject('contact us/android.widget.FrameLayout3'), 0)

Mobile.tap(findTestObject('contact us/android.widget.Button0 - Send'), 0)

Mobile.tap(findTestObject('contact us/android.widget.TextView1 - OK'), 0)

Mobile.tap(findTestObject('contact us/android.widget.TextView4 - Home'), 0)

Mobile.tap(findTestObject('contact us/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('contact us/android.widget.TextView30 - Logout'), 0)

Mobile.tap(findTestObject('contact us/android.widget.TextView3 - Forgot User ID or Password'), 0)

Mobile.tap(findTestObject('contact us/android.widget.TextView2 - Forgot Password'), 0)

Mobile.setText(findTestObject('contact us/android.widget.EditText0 - Editing. (1)'), '1234567890987654', 0)

Mobile.tap(findTestObject('contact us/android.widget.FrameLayout3'), 0)

Mobile.setText(findTestObject('contact us/android.widget.EditText1 - Enter password.. Double tap to edit. (1)'), '1234', 
    0)

Mobile.tap(findTestObject('contact us/android.widget.TextView0 - Forgot Password'), 0)

Mobile.tap(findTestObject('contact us/android.widget.Button0 - Submit'), 0)

Mobile.tap(findTestObject('contact us/android.widget.TextView1 - OK (1)'), 0)

Mobile.closeApplication()

