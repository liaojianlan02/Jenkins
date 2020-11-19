package com.webtest.demo;

import org.testng.annotations.Test;

import com.webest.core.BaseTest;

public class EditDemo extends BaseTest{
	/**
	 * ��֮ǰ���ʵ����Ӻ��ֽ��б༭
	 */
	//@Test
	public void test_editaddcustom() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'�ͻ�����')]");
		webtest.click("xpath=//a[contains(text(),'����ͻ�')]");
		webtest.click("xpath=//a[@href='/admin/user/edit/6/other/1']");
		webtest.type("name=user_password", "123456");
		webtest.type("name=user_password_con", "123456");
		webtest.click("xpath=//label[contains(text(),'�ӱ�')]");
		webtest.type("name=demo7", "����ǧ��");
		webtest.type("name=demo9", "�ӱ�ʡʯ��ׯ���϶�����·");
		webtest.click("xpath=//button[contains(text(),'����ͻ���Ϣ')]");
	}
	//@Test
	public void test_editaddcustomAdress() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'�ͻ�����')]");
		webtest.click("xpath=//a[contains(text(),'����ͻ�')]");
		webtest.click("xpath=//a[@href='/admin/user/edit/6/other/1']");
		webtest.click("xpath=//a[@href='#user_b']");
		webtest.click("xpath=//button[contains(text(),'��ӵ�ַ')]");
		webtest.type("name=true_name", "�ν���");
		webtest.selectByValue("id=show_address_area", "35");
		webtest.type("name=address", "�϶�����·20�źӱ�ʦ����ѧ");
		webtest.type("name=zip_code", "537100");
		webtest.type("name=mod_phone", "18377564491");
		webtest.click("xpath=//button[contains(text(),'�޸�')]");
		webtest.click("xpath=//button[contains(text(),'����ͻ���Ϣ')]");
	}
	@Test
	public void test_editcustomextends() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'�ͻ�����')]");
		webtest.click("xpath=//a[contains(text(),'�ͻ���չ��Ϣ')]");
		webtest.click("xpath=//a[@href='/admin/user/editUserRegExtend/reg-e/15']");
		webtest.selectByValue("name=field_type", "checkbox");
		webtest.type("name=field_radio_checkbox_select",  "\n" + "4=���" + "\n" + "5=�Ϻ�");
		webtest.click("xpath=//button[contains(text(),'����ͻ���չ��Ϣ')]");
	}
	@Test
	public void testeditcustomgroups1() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'�ͻ�����')]");
		webtest.click("xpath=//a[contains(text(),'����ͻ���')]");
		webtest.click("xpath=//a[@href='/admin/user/group/edit/8']");
		webtest.type("name=integral_num_start", "0");
		webtest.type("name=integral_num_end", "150");
		webtest.click("xpath=//button[contains(text(),'����ͻ�����Ϣ')]");
	}
	@Test
	public void testeditcustomgroups2() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'�ͻ�����')]");
		webtest.click("xpath=//a[contains(text(),'����ͻ���')]");
		webtest.click("xpath=//a[@href='/admin/user/group/edit/1']");
		webtest.type("name=integral_num_start", "151");
		webtest.type("name=integral_num_end", "499");
		webtest.click("xpath=//button[contains(text(),'����ͻ�����Ϣ')]");
	}
	@Test
	public void testeditcustomintegral() throws InterruptedException {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'�ͻ�����')]");
		webtest.mouseToElement("xpath=//a[contains(text(),'�������')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'���ֹ���')]");
		webtest.click("xpath=//a[@href='/admin/user/integral/editIntegralRule/5']");
		webtest.type("name=integral_rule_info", "����ͬʱ��¼һ���˻�,����¼������ǿ���˳�");
		webtest.click("xpath=//button[contains(text(),'������ֹ���')]");
	}
	/**
	 * ��Ӫ����ģ��
	 */
	
	@Test
	public void test_edit1() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'��Ӫ����')]");
		webtest.click("xpath=//a[contains(text(),'�Żݴ�������')]");
		webtest.click("xpath=//a[@href='/admin/goods/promotions/edit/7']");
		webtest.type("name=promotions_info", "��������1�������е���Ʒ������һ���Ĵ�������");
		webtest.click("xpath=//button[contains(text(),'�����������')]");
	}


}
