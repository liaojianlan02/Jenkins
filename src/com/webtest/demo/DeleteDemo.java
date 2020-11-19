package com.webtest.demo;

import org.testng.annotations.Test;

import com.webest.core.BaseTest;

public class DeleteDemo extends BaseTest{
	/**
	 * ʵ��ɾ������
	 */
	@Test
	public void test_detelecustom() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'�ͻ�����')]");
		webtest.click("xpath=//a[contains(text(),'����ͻ�')]");
		webtest.click("xpath=//a[@onclick='user_del_js(6);']");
		webtest.alertAccept();
	}
	@Test
	public void test_deletecustomextends() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'�ͻ�����')]");
		webtest.click("xpath=//a[contains(text(),'�ͻ���չ��Ϣ')]");
		webtest.click("xpath=//a[@onclick='return field_del_js(15);']");
		webtest.alertAccept();
	}
	@Test
	public void test_deletecustomgroups() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'�ͻ�����')]");
		webtest.click("xpath=//a[contains(text(),'����ͻ���')]");
		webtest.click("xpath=//a[@onclick='return group_del_js(9);;']");
		webtest.alertAccept();
	}
	@Test
	public void test_deleterule() throws InterruptedException {
		testLogin();
		testLogin();
		webtest.click("xpath=//a[contains(text(),'�ͻ�����')]");
		webtest.mouseToElement("xpath=//a[contains(text(),'�������')]");
		webtest.click("xpath=//a[contains(text(),'���ֹ���')]");
		webtest.click("xpath=//a[@href='/admin/user/integral/delIntegralRule/3']");
		webtest.alertAccept();
	}
	/**
	 * ��Ӫ����ģ��
	 */
	
	@Test
	public void test_delete() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'��Ӫ����')]");
		webtest.click("xpath=//a[contains(text(),'�Żݴ�������')]");
		webtest.click("xpath=//a[@href='/admin/goods/promotions/del/7']");
		webtest.alertAccept();
	}

}
