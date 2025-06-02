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

import customKeywords.RandomDataUtils


String password=RandomDataUtils.generaterandomPassword()

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://naveenautomationlabs.com/opencart/')

WebUI.click(findTestObject('Page_Your Store/span_My Account'))

WebUI.click(findTestObject('Page_Your Store/a_Register'))

WebUI.verifyElementVisible(findTestObject('Page_Register Account/h1_Register Account'))

WebUI.verifyElementText(findTestObject('Page_Register Account/h1_Register Account'), 'Register Account')

WebUI.clearText(findTestObject('Page_Register Account/input_First Name_firstname'))

WebUI.sendKeys(findTestObject('Page_Register Account/input_First Name_firstname'), RandomDataUtils.generateRandomName())

WebUI.clearText(findTestObject('Page_Register Account/input_Last Name_lastname'))

WebUI.sendKeys(findTestObject('Page_Register Account/input_Last Name_lastname'), RandomDataUtils.generateRandomName())

WebUI.clearText(findTestObject('Page_Register Account/input_E-Mail_email'))

WebUI.sendKeys(findTestObject('Page_Register Account/input_E-Mail_email'), RandomDataUtils.generateRandomEmail())

WebUI.clearText(findTestObject('Page_Register Account/input_Telephone_telephone'))

WebUI.sendKeys(findTestObject('Page_Register Account/input_Telephone_telephone'), RandomDataUtils.generateRandomTelephone())

WebUI.clearText(findTestObject('Page_Register Account/input_Password_password'))

WebUI.sendKeys(findTestObject('Page_Register Account/input_Password_password'), password)

WebUI.clearText(findTestObject('Page_Register Account/input_Password Confirm_confirm'))

WebUI.sendKeys(findTestObject('Page_Register Account/input_Password Confirm_confirm'),password)

WebUI.uncheck(findTestObject('Page_Register Account/input_Privacy Policy_agree'))

WebUI.check(findTestObject('Object Repository/Page_Register Account/input_Privacy Policy_agree'))

WebUI.verifyElementClickable(findTestObject('Page_Register Account/input_Privacy Policy_btn btn-primary'))

WebUI.click(findTestObject('Page_Register Account/input_Privacy Policy_btn btn-primary'))

WebUI.waitForElementVisible(findTestObject('Page_Your Account Has Been Created/h1_Your Account Has Been Created'),30)

WebUI.verifyElementText(findTestObject('Page_Your Account Has Been Created/h1_Your Account Has Been Created'), 'Your Account Has Been Created!')

WebUI.closeBrowser()




