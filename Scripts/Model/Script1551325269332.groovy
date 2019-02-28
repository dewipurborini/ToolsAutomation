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

WebUI.click(findTestObject('config/Page_WMS Tools/Menu_Configurator'))

WebUI.click(findTestObject('config/Page_WMS Tools/Menu_Model'))

WebUI.click(findTestObject('Page_WMS Tools/button_Add'))

WebUI.setText(findTestObject('config/Page_WMS Tools/input_Name'), 'automatedmodel')

not_run: WebUI.click(findTestObject('Object Repository/config/Page_WMS Tools/span_SQL'))

WebUI.click(findTestObject('Object Repository/config/Page_WMS Tools/button_Add Attribute'))

WebUI.setText(findTestObject('Object Repository/config/Page_WMS Tools/input__code'), 'code')

WebUI.setText(findTestObject('Object Repository/config/Page_WMS Tools/input_Description_name'), 'code')

WebUI.click(findTestObject('Object Repository/config/Page_WMS Tools/button_OK'))

not_run: WebUI.click(findTestObject('Object Repository/config/Page_WMS Tools/button_Add Attribute'))

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/config/Page_WMS Tools/select_StringIntegerBigDecimal'), 
    'Integer', true)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/config/Page_WMS Tools/select_StringIntegerBigDecimal'), 
    'BigDecimal', true)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/config/Page_WMS Tools/select_StringIntegerBigDecimal'), 
    'Boolean', true)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/config/Page_WMS Tools/select_StringIntegerBigDecimal'), 
    'Timestamp', true)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/config/Page_WMS Tools/select_StringIntegerBigDecimal'), 
    'Reference', true)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/config/Page_WMS Tools/select_None--- EMPTY MODEL (NU'), 
    'Account_V_1_0', true)

not_run: WebUI.setText(findTestObject('Object Repository/config/Page_WMS Tools/input__code_4'), 'ref')

not_run: WebUI.setText(findTestObject('Object Repository/config/Page_WMS Tools/input_Description_name_4'), 'ref')

not_run: WebUI.click(findTestObject('Object Repository/config/Page_WMS Tools/button_OK'))

WebUI.click(findTestObject('config/Page_WMS Tools/Tab_Structures'))

WebUI.click(findTestObject('config/Page_WMS Tools/button_Add Structure Group'))

WebUI.click(findTestObject('config/Page_WMS Tools/checkbox_input'))

WebUI.click(findTestObject('Object Repository/config/Page_WMS Tools/ul_Structure_select2-selection'))

WebUI.click(findTestObject('config/Page_WMS Tools/button_OK'))

WebUI.click(findTestObject('config/Page_WMS Tools/model_sctructure_com'))

WebUI.click(findTestObject('Page_WMS Tools/button_popUpSave'))

WebUI.setText(findTestObject('config/Page_WMS Tools/Input comment'), 'add model automated')

WebUI.click(findTestObject('Page_WMS Tools/button_Save'))

