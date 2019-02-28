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

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_WMS Tools/Model/Menu_Configurator'))

WebUI.click(findTestObject('Page_WMS Tools/Model/Menu_Model'))

WebUI.click(findTestObject('Page_WMS Tools/button_Add'))

WebUI.setText(findTestObject('Page_WMS Tools/input_Name'), 'automatedmodel')

not_run: WebUI.click(findTestObject('Page_WMS Tools/Model/span_ModelSQLNoSQL'))

WebUI.click(findTestObject('Page_WMS Tools/Model/button_Add Attribute'))

//
WebUI.setText(findTestObject('Page_WMS Tools/input_Code'), 'alphabet')

WebUI.setText(findTestObject('Page_WMS Tools/Model/input_Description_name'), 'alphanumeric')

WebUI.click(findTestObject('Page_WMS Tools/button_OK'))

//
not_run: WebUI.click(findTestObject('Page_WMS Tools/Model/button_Add Attribute'))

not_run: WebUI.setText(findTestObject('Object Repository/config/Page_WMS Tools/input__code'), 'angka')

not_run: WebUI.setText(findTestObject('Page_WMS Tools/Model/input_Description_name'), 'angka')

not_run: WebUI.selectOptionByValue(findTestObject('Page_WMS Tools/Model/select_Type'), 
    'Integer', true)

not_run: WebUI.click(findTestObject('Page_WMS Tools/button_OK'))

//
not_run: WebUI.click(findTestObject('Page_WMS Tools/Model/button_Add Attribute'))

not_run: WebUI.selectOptionByValue(findTestObject('Page_WMS Tools/Model/select_Type'), 
    'BigDecimal', true)

not_run: WebUI.selectOptionByValue(findTestObject('Page_WMS Tools/Model/select_Type'), 
    'Boolean', true)

not_run: WebUI.selectOptionByValue(findTestObject('Page_WMS Tools/Model/select_Type'), 
    'Timestamp', true)

not_run: WebUI.selectOptionByValue(findTestObject('Page_WMS Tools/Model/select_Type'), 
    'Reference', true)

not_run: WebUI.selectOptionByValue(findTestObject('Page_WMS Tools/Model/select_Reference'), 
    'Account_V_1_0', true)

not_run: WebUI.setText(findTestObject('Page_WMS Tools/input_Code'), 'ref')

not_run: WebUI.setText(findTestObject('Page_WMS Tools/Model/input_Description_name'), 'ref')

not_run: WebUI.click(findTestObject('Page_WMS Tools/button_OK'))

WebUI.click(findTestObject('Page_WMS Tools/Model/Tab_Structures'))

WebUI.click(findTestObject('Page_WMS Tools/Model/button_Add Structure Group'))

WebUI.click(findTestObject('Page_WMS Tools/Model/Structure_selection_com'))

WebUI.click(findTestObject('Page_WMS Tools/Model/model_sctructure_com'))

WebUI.check(findTestObject('Page_WMS Tools/Model/checkbox_input'))

WebUI.check(findTestObject('Page_WMS Tools/Model/checkbox_primaryKey'))

WebUI.check(findTestObject('Page_WMS Tools/Model/checkbox_uniqueKey'))

WebUI.click(findTestObject('Page_WMS Tools/button_OK'))

not_run: WebUI.click(findTestObject('Page_WMS Tools/button_Save'))

not_run: WebUI.setText(findTestObject('Page_WMS Tools/Model/Input comment'), 'add model automated')

not_run: WebUI.click(findTestObject('Page_WMS Tools/button_commentSave'))

