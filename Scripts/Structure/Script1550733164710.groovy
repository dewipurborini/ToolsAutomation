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

WebUI.click(findTestObject('Page_WMS Tools/Structure/Menu_Structure'))

WebUI.click(findTestObject('Page_WMS Tools/button_Add'))

WebUI.setText(findTestObject('Page_WMS Tools/input_Code'), 'automated structure')

WebUI.setText(findTestObject('Page_WMS Tools/input_Name'), 'tester')

WebUI.click(findTestObject('Page_WMS Tools/Structure/dropdown_--SELECT PARENT--'))

WebUI.click(findTestObject('Page_WMS Tools/Structure/dropdownStructureParent_COM'))

WebUI.click(findTestObject('Page_WMS Tools/button_Save'))

WebUI.verifyElementPresent(findTestObject('Page_WMS Tools/Structure/DialogueText_Add Structure Success'), 0)

WebUI.click(findTestObject('Page_WMS Tools/button_OK'))

WebUI.closeBrowser()

