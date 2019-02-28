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

WebUI.click(findTestObject('Page_WMS Tools/Menu_Main'))

WebUI.click(findTestObject('Page_WMS Tools/Type/Menu_Type'))

WebUI.click(findTestObject('Page_WMS Tools/button_Add'))

WebUI.setText(findTestObject('Page_WMS Tools/input_Code'), 'automatedType')

WebUI.setText(findTestObject('Page_WMS Tools/input_Name'), 'automatedType')

WebUI.click(findTestObject('Page_WMS Tools/button_Add'))

WebUI.click(findTestObject('Page_WMS Tools/Type/span_--SELECT TOPIC NAME--'))

WebUI.click(findTestObject('Page_WMS Tools/Type/dropdownTypeTopic'))

WebUI.click(findTestObject('Page_WMS Tools/Type/span_--SELECT TOPIC VERSION--'))

WebUI.click(findTestObject('Page_WMS Tools/Type/dropdownTypeVersion'))

WebUI.click(findTestObject('Page_WMS Tools/button_popUpSave'))

WebUI.click(findTestObject('Page_WMS Tools/button_Save'))

WebUI.verifyElementPresent(findTestObject('Page_WMS Tools/Type/Dialogue_Save Type Success'), 0)

WebUI.click(findTestObject('Page_WMS Tools/button_OK'))

WebUI.closeBrowser()

