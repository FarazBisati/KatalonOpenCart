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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://naveenautomationlabs.com/opencart/')

WebUI.click(findTestObject('Object Repository/Page_Your Store/span_My Account'))

WebUI.click(findTestObject('Object Repository/Page_Your Store/a_Login'))

WebUI.clearText(findTestObject('Object Repository/Page_Account Login/input_E-Mail Address_email'))

WebUI.sendKeys(findTestObject('Object Repository/Page_Account Login/input_E-Mail Address_email'),'abc@testabc.com')

WebUI.clearText(findTestObject('Object Repository/Page_Account Login/input_Password_password'))

WebUI.sendKeys(findTestObject('Object Repository/Page_Account Login/input_Password_password'),'Test@123')

Boolean enabled=WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Account Login/input_Forgotten Password_btn btn-primary'))

if(enabled)
{
	WebUI.click(findTestObject('Object Repository/Page_Account Login/input_Forgotten Password_btn btn-primary'))
}
else
{
	assert false : "Element is not clickable."
}

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_My Account/h2_My Account'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_My Account/h2_My Account'), 'My Account')

WebUI.click(findTestObject('Object Repository/Page_My Account/a_Logout'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Account Logout/h1_Account Logout'))

WebUI.closeBrowser()

