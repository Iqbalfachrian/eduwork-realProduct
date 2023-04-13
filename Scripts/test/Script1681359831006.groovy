import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('C:\\Users\\Dell\\Katalon Studio\\LuluShopping\\Mobile App\\Lulu Shopping_2.2.10.1.1.apk', true)

Mobile.tap(findTestObject('Object Repository/test/android.widget.Button - SKIP'), 0)

Mobile.tap(findTestObject('Object Repository/test/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/test/android.widget.Button - ADD'), 0)

Mobile.tap(findTestObject('Object Repository/test/android.widget.TextView - Cart'), 0)

Mobile.tap(findTestObject('Object Repository/test/android.widget.Button - Proceed'), 0)

Mobile.setText(findTestObject('Object Repository/test/android.widget.EditText - Enter Mobile number or Email'), 'iqbal@mail.com', 
    0)

Mobile.tap(findTestObject('Object Repository/test/android.widget.Button - Proceed (1)'), 0)

Mobile.setText(findTestObject('Object Repository/test/android.widget.EditText - First Name'), 'iqbal', 0)

Mobile.setText(findTestObject('Object Repository/test/android.widget.EditText - Last Name'), 'fachrian', 0)

Mobile.setText(findTestObject('Object Repository/test/android.widget.EditText - Phone Number'), '123456', 0)

Mobile.setText(findTestObject('Object Repository/test/android.widget.EditText - Create Password'), 'Fullst@ck2022', 0)

Mobile.tap(findTestObject('Object Repository/test/android.widget.Button - Continue'), 0)

Mobile.closeApplication()

