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

WebUI.click(findTestObject('Menu/Task'))

WebUI.click(findTestObject('Task Adjusment/Task Adjusment'))

WebUI.click(findTestObject('Task Adjusment/Regional/Choose regional'))

WebUI.setText(findTestObject('Task Adjusment/Regional/Search regional'), 'West Java')

WebUI.click(findTestObject('Task Adjusment/Regional/Btn search'))

WebUI.click(findTestObject('Task Adjusment/Regional/btn west java'))

WebUI.click(findTestObject('Task Adjusment/Branch/choose branch'))

WebUI.setText(findTestObject('Task Adjusment/Branch/search branch'), 'bandung')

WebUI.click(findTestObject('Task Adjusment/Branch/btn search'))

WebUI.click(findTestObject('Task Adjusment/Branch/btn bandung'))

WebUI.click(findTestObject('Task Adjusment/Field Collector/Choose collector'))

WebUI.setText(findTestObject('Task Adjusment/Field Collector/text search'), 'Chairul Amran')

WebUI.click(findTestObject('Task Adjusment/Field Collector/btn search'))

WebUI.click(findTestObject('Task Adjusment/Field Collector/chairul'))

WebUI.takeScreenshotAsCheckpoint('Menampilkan pencarian yg di cari')

