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

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/ServiceGen/Page_WMS Tools/a_Service Generator'))

WebUI.click(findTestObject('Object Repository/ServiceGen/Page_WMS Tools/a_Services'))

WebUI.click(findTestObject('Page_WMS Tools/button_Add'))

WebUI.click(findTestObject('ServiceGen/Page_WMS Tools/label_Create New Service'))

WebUI.setText(findTestObject('ServiceGen/Page_WMS Tools/input_New Service Name'), 'automated')

WebUI.click(findTestObject('Object Repository/ServiceGen/Page_WMS Tools/button_Confirm'))

WebUI.setText(findTestObject('ServiceGen/Page_WMS Tools/input_SearchService'), 'automated')

WebUI.click(findTestObject('ServiceGen/Page_WMS Tools/link_View Service'))

WebUI.verifyElementPresent(findTestObject('ServiceGen/Page_WMS Tools/h1_automated 1.0 Label'), 0)

WebUI.closeBrowser()

