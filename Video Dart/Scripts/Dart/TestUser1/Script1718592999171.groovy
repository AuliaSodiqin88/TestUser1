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

WebUI.openBrowser('')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sendbird-uikit-react.netlify.app/group_channel?appId=37C8DB25-8B44-435F-A528-5BA9B9965FD0&userId=Aulia%20Sendbird&nickname=Aulia')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/UserTest1/Page_Testing App/svg'))

WebUI.click(findTestObject('Object Repository/UserTest1/Page_Testing App/div_Group'))

WebUI.click(findTestObject('Object Repository/UserTest1/Page_Testing App/span_User'))

WebUI.click(findTestObject('Object Repository/UserTest1/Page_Testing App/span_User_sendbird-checkbox--checkmark'))

WebUI.click(findTestObject('Object Repository/UserTest1/Page_Testing App/span_Create'))

WebUI.setText(findTestObject('UserTest1/Page_Testing App/Page_Testing App/div_testing automate_sendbird-message-input-text-field'), 
    'Testing Automate')

WebUI.sendKeys(findTestObject('UserTest1/Page_Testing App/Page_Testing App/frame/Page_Testing App/div_testing automate_sendbird-message-input-text-field'), 
    Keys.chord(Keys.ENTER))

WebUI.uploadFile(findTestObject('input_browse'), 'C:\\HP Wolf\\Downloads\\Itachi.png')

WebUI.closeBrowser()

