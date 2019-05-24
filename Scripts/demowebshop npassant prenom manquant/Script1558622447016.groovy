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
import org.openqa.selenium.Keys as Keys

Random rand = new Random()

float min = 10

float max = 200

int result = (rand.nextFloat() * (max - min)) + min

println(result)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://demowebshop.tricentis.com/')

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop/a_Register'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Register/input_Gender_Gender (1)'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Register/input_Male_Gender (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Demo Web Shop. Register/input_First name_FirstName (1)'), findTestData(
        'test').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/Page_Demo Web Shop. Register/input_Last name_LastName (1)'), '')

WebUI.setText(findTestObject('Page_Demo Web Shop. Register/input_Email_Email (1)'), result + '@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Demo Web Shop. Register/input_Password_Password (1)'), 'DnK1SUDm1noeoE8V9MLX/Q==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Demo Web Shop. Register/input_Confirm password_ConfirmPassword (1)'), 
    'DnK1SUDm1noeoE8V9MLX/Q==')

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop. Register/input__register-button'))

WebUI.takeScreenshot()

WebUI.closeBrowser()

