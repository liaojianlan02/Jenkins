package com.webtest.demo;

import org.testng.annotations.Test;

import com.webest.core.BaseTest;

public class Demo extends BaseTest {
	/*
	 * 
	 * �ͻ�����ģ��
	 */
	// ʵ�ֹ���ͻ��е�����¹˿�
	// @Test

	public void test1() throws InterruptedException {
		testLogin();
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'�ͻ�����')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'����ͻ�')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'����¿ͻ�')]");
		webtest.selectByValue("name=group_id", "1");
		webtest.type("name=user_name", "qianx");
		webtest.type("name=user_email", "2222222221@qq.com");
		webtest.type("name=user_password", "admin1");
		webtest.type("name=user_password_con", "admin1");
		Thread.sleep(3000);
		webtest.click("xpath=//button[@type='submit']");
	}

	// @Test
	public void test_add() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'�ͻ�����')]");
		webtest.click("xpath=//a[contains(text(),'����ͻ�')]");
		webtest.click("xpath=//a[contains(text(),'����¿ͻ�')]");
		webtest.type("name=user_avatar", "F:\\2018011986.jpg");
		webtest.selectByValue("name=group_id", "1");
		webtest.type("name=user_name", "use");
		webtest.selectByValue("name=user_sex", "2");
		webtest.type("name=user_email", "2222222721@qq.com");
		webtest.type("name=user_password", "123456");
		webtest.type("name=user_password_con", "123456");
		webtest.type("name=user_phone", "18255664491");
		webtest.click("xpath=//button[@type='submit']");
	}

	// ʵ�ֿͻ���չ��Ϣ�е������չ��Ϣ
	// @Test
	public void test2() throws InterruptedException {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'�ͻ�����')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'�ͻ���չ��Ϣ')]");
		webtest.click("xpath=//a[contains(text(),'�����չ��Ϣ')]");
		webtest.type("name=field_name", "demo2");
		webtest.type("name=field_title", "����ʡ��");
		Thread.sleep(3000);
		webtest.selectByValue("name=field_type", "checkbox");
		webtest.type("name=field_radio_checkbox_select", "1=����" + "\n" + "2=�ӱ�" + "\n" + "3=����");
		webtest.click("xpath=//button[@type='submit']");
	}

	// @Test
	public void test2_addchecbox() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'�ͻ�����')]");
		webtest.click("xpath=//a[contains(text(),'�ͻ���չ��Ϣ')]");
		webtest.click("xpath=//a[contains(text(),'�����չ��Ϣ')]");
		webtest.type("name=field_name", "demo2");
		webtest.type("name=field_title", "����ʡ��");
		webtest.selectByValue("name=field_type", "checkbox");
		webtest.type("name=field_radio_checkbox_select", "1=����" + "\n" + "2=�ӱ�" + "\n" + "3=����");
		webtest.click("xpath=//input[@value='2']");
		webtest.click("xpath=//button[@type='submit']");
	}

	// @Test
	public void test2_addradio() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'�ͻ�����')]");
		webtest.click("xpath=//a[contains(text(),'�ͻ���չ��Ϣ')]");
		webtest.click("xpath=//a[contains(text(),'�����չ��Ϣ')]");
		webtest.type("name=field_name", "demo3");
		webtest.type("name=field_title", "�Ա�");
		webtest.selectByValue("name=field_type", "radio");
		webtest.type("name=field_radio_checkbox_select", "1=�� " + "\n" + "2=Ů");
		webtest.click("xpath=//button[@type='submit']");

	}

	// @Test
	public void test2_addradioClose() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'�ͻ�����')]");
		webtest.click("xpath=//a[contains(text(),'�ͻ���չ��Ϣ')]");
		webtest.click("xpath=//a[contains(text(),'�����չ��Ϣ')]");
		webtest.type("name=field_name", "demo4");
		webtest.type("name=field_title", "ְҵ");
		webtest.selectByValue("name=field_type", "radio");
		webtest.type("name=field_radio_checkbox_select", "1=ѧ�� " + "\n" + "2=��ʦ");
		webtest.click("xpath=//input[@value='2']");
		webtest.click("xpath=//label[contains(text(),'�ر�')]");
		webtest.click("xpath=//button[@type='submit']");
	}

	// @Test
	public void test3() throws InterruptedException {
		testLogin();
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'�ͻ�����')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'�ͻ���չ��Ϣ')]");
		webtest.click("xpath=//a[contains(text(),'�����չ��Ϣ')]");
		webtest.type("name=field_name", "demo5");
		webtest.type("name=field_title", "�������");
		Thread.sleep(3000);
		webtest.selectByValue("name=field_type", "select");
		webtest.type("name=field_radio_checkbox_select",
				"1=1998" + "\n" + "2=1999" + "\n" + "3=2000" + "\n" + "4=2001" + "\n" + "5=2002");
		webtest.click("xpath=//button[@type='submit']");
	}

	//@Test
	public void test3_addselectClose() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'�ͻ�����')]");
		webtest.click("xpath=//a[contains(text(),'�ͻ���չ��Ϣ')]");
		webtest.click("xpath=//a[contains(text(),'�����չ��Ϣ')]");
		webtest.type("name=field_name", "demo6");
		webtest.type("name=field_title", "�����·�");
		webtest.selectByValue("name=field_type", "select");
		webtest.type("name=field_radio_checkbox_select",
				"1=1��" + "\n" + "2=2��" + "\n" + "3=3��" + "\n" + "4=4��" + "\n" + "5=5��" + "6=6��" + "\n" + "7=7��" + "\n"
						+ "8=8��" + "\n" + "9=9��" + "\n" + "10=10��" + "\n" + "11=11��" + "\n" + "12=12��");
		webtest.click("xpath=//label[contains(text(),'�ر�')]");
		webtest.click("xpath=//button[@type='submit']");
	}
	//@Test
	public void test3_addtext() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'�ͻ�����')]");
		webtest.click("xpath=//a[contains(text(),'�ͻ���չ��Ϣ')]");
		webtest.click("xpath=//a[contains(text(),'�����չ��Ϣ')]");
		webtest.type("name=field_name", "demo7");
		webtest.type("name=field_title", "��ϲ��������");
		webtest.selectByValue("name=field_type", "text");
		webtest.click("xpath=//input[@value='2']");
		webtest.click("xpath=//button[@type='submit']");
	}
	//@Test
	public void test3_addtextClose() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'�ͻ�����')]");
		webtest.click("xpath=//a[contains(text(),'�ͻ���չ��Ϣ')]");
		webtest.click("xpath=//a[contains(text(),'�����չ��Ϣ')]");
		webtest.type("name=field_name", "demo8");
		webtest.type("name=field_title", "��ϲ�����˶�");
		webtest.selectByValue("name=field_type", "text");
		webtest.click("xpath=//label[contains(text(),'�ر�')]");
		webtest.click("xpath=//button[@type='submit']");
	}
	//@Test
	public void test3_addtextarea() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'�ͻ�����')]");
		webtest.click("xpath=//a[contains(text(),'�ͻ���չ��Ϣ')]");
		webtest.click("xpath=//a[contains(text(),'�����չ��Ϣ')]");
		webtest.type("name=field_name", "demo9");
		webtest.type("name=field_title", "��ͥ��ϸסַ");
		webtest.selectByValue("name=field_type", "textarea");
		webtest.click("xpath=//input[@value='2']");
		
		webtest.click("xpath=//button[@type='submit']");
	}
	//@Test
	public void test3_addtextareaClose() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'�ͻ�����')]");
		webtest.click("xpath=//a[contains(text(),'�ͻ���չ��Ϣ')]");
		webtest.click("xpath=//a[contains(text(),'�����չ��Ϣ')]");
		webtest.type("name=field_name", "demo10");
		webtest.type("name=field_title", "����ѧУ��Ϣ");
		webtest.selectByValue("name=field_type", "textarea");
		webtest.click("xpath=//label[contains(text(),'�ر�')]");
		webtest.click("xpath=//button[@type='submit']");
	}

	// @Test
	public void test4() throws InterruptedException {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'�ͻ�����')]");
		webtest.click("xpath=//a[contains(text(),'����ͻ���')]");
		webtest.click("xpath=//a[contains(text(),'��ӿͻ���')]");
		webtest.type("name=user_group_name", "��ͨ�ͻ�");
		webtest.type("name=integral_num_start", "0");
		webtest.type("name=integral_num_end", "100");
		webtest.click("name=integral_num_state");
		webtest.click("xpath=//button[@type='submit']");
	}
	//@Test
	public void test4_add() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'�ͻ�����')]");
		webtest.click("xpath=//a[contains(text(),'����ͻ���')]");
		webtest.click("xpath=//a[contains(text(),'��ӿͻ���')]");
		webtest.type("name=user_group_name", "�߼���Ա");
		webtest.type("name=integral_num_start", "200");
		webtest.type("name=integral_num_end", "500");
		webtest.click("name=integral_num_state");
		webtest.click("xpath=//button[@type='submit']");
	}

   // @Test
	public void test5() throws InterruptedException {
		testLogin();
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'�ͻ�����')]");
		webtest.mouseToElement("xpath=//a[contains(text(),'�������')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'���ֹ���')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'����¹���')]");
		webtest.type("name=integral_rule_name", "���۹���");
		webtest.type("name=integral_rule_info", "��������Ʒ������һ���Ĵ���");
		webtest.type("name=integral_rule_start_time", "2020-11-20 15:08");
		webtest.type("name=integral_rule_end_time", "2020-12-20 15:08");
		webtest.click("xpath=//a[@href='#integral_rule_c']");
		webtest.type("name=shopping_amount", "500");
		webtest.type("name=integral_num", "2");
		webtest.click("xpath=//button[@type='submit']");
	}
	//@Test
	public void test5_addruleClose() throws InterruptedException {
		testLogin();
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'�ͻ�����')]");
		webtest.mouseToElement("xpath=//a[contains(text(),'�������')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'���ֹ���')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'����¹���')]");
		webtest.type("name=integral_rule_name", "����1");
		webtest.type("name=integral_rule_info", "������ԣ��м��");
		webtest.type("name=integral_rule_start_time", "2020-11-20 15:08");
		webtest.type("name=integral_rule_end_time", "2020-12-20 15:08");
		webtest.selectByValue("name=integral_rule_state", "2");
		webtest.click("xpath=//a[@href='#integral_rule_c']");
		webtest.type("name=shopping_amount", "500");
		webtest.type("name=integral_num", "2");
		webtest.click("xpath=//button[@type='submit']");
	}
	//@Test//ʵ�ֻ��ֹ���
	public void test5_addruleintegral() throws InterruptedException {
		testLogin();
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'�ͻ�����')]");
		webtest.mouseToElement("xpath=//a[contains(text(),'�������')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'���ֹ���')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'����¹���')]");
		webtest.type("name=integral_rule_name", "����2");
		webtest.type("name=integral_rule_info", "���ø�����Ʒ������С͵");
		webtest.type("name=integral_rule_start_time", "2020-11-20 15:08");
		webtest.type("name=integral_rule_end_time", "2020-12-20 15:08");
		webtest.click("xpath=//a[@href='#integral_rule_c']");
		webtest.selectByValue("name=shopping_type", "2");
		webtest.type("name=shopping_amount", "500");
		webtest.selectByValue("name=integral_type_id", "2");
		webtest.type("name=integral_num", "2");
		webtest.click("xpath=//button[@type='submit']");
	}
	//@Test
	public void test5_addselectcustomergroup() throws InterruptedException {
		testLogin();
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'�ͻ�����')]");
		webtest.mouseToElement("xpath=//a[contains(text(),'�������')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'���ֹ���')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'����¹���')]");
		webtest.type("name=integral_rule_name", "����3");
		webtest.type("name=integral_rule_info", "����ͬʱ��¼һ���˻�");
		webtest.type("name=integral_rule_start_time", "2020-11-20 15:08");
		webtest.type("name=integral_rule_end_time", "2020-12-20 15:08");
		webtest.click("xpath=//a[@href='#integral_rule_c']");
		webtest.type("name=shopping_amount", "500");
		webtest.type("name=integral_num", "5");
		webtest.click("xpath=//a[@href='#integral_rule_b']");
		webtest.selectByValue("name=integral_rule_user_type", "user_group");
		webtest.click("xpath=//label[contains(text(),'��ͨ��Ա')]");
		webtest.click("xpath=//button[@type='submit']");
	}
	//@Test//���Ի���������ͨ�˿͵�ѡ��
	public void test5_addselectcustomergroup1() throws InterruptedException {
		testLogin();
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'�ͻ�����')]");
		webtest.mouseToElement("xpath=//a[contains(text(),'�������')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'���ֹ���')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'����¹���')]");
		webtest.type("name=integral_rule_name", "����3");
		webtest.type("name=integral_rule_info", "����ͬʱ��¼һ���˻�");
		webtest.type("name=integral_rule_start_time", "2020-11-20 15:08");
		webtest.type("name=integral_rule_end_time", "2020-12-20 15:08");
		webtest.click("xpath=//a[@href='#integral_rule_c']");
		webtest.type("name=shopping_amount", "500");
		webtest.type("name=integral_num", "5");
		webtest.click("xpath=//a[@href='#integral_rule_b']");
		webtest.selectByValue("name=integral_rule_user_type", "user_group");
		webtest.click("xpath=//label[contains(text(),'��ͨ�˿�')]");
		webtest.click("xpath=//button[@type='submit']");
	}
	//@Test//���Ի������и߼���Ա��ѡ��
	public void test5_addselectcustomergroup2() throws InterruptedException {
		testLogin();
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'�ͻ�����')]");
		webtest.mouseToElement("xpath=//a[contains(text(),'�������')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'���ֹ���')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'����¹���')]");
		webtest.type("name=integral_rule_name", "����3");
		webtest.type("name=integral_rule_info", "����ͬʱ��¼һ���˻�");
		webtest.type("name=integral_rule_start_time", "2020-11-20 15:08");
		webtest.type("name=integral_rule_end_time", "2020-12-20 15:08");
		webtest.click("xpath=//a[@href='#integral_rule_c']");
		webtest.type("name=shopping_amount", "500");
		webtest.type("name=integral_num", "5");
		webtest.click("xpath=//a[@href='#integral_rule_b']");
		webtest.selectByValue("name=integral_rule_user_type", "user_group");
		webtest.click("xpath=//label[contains(text(),'�߼���Ա')]");
		webtest.click("xpath=//button[@type='submit']");
	}
	//@Test
	public void test5_addselectgoods1() throws InterruptedException {
		testLogin();
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'�ͻ�����')]");
		webtest.mouseToElement("xpath=//a[contains(text(),'�������')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'���ֹ���')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'����¹���')]");
		webtest.type("name=integral_rule_name", "����4");
		webtest.type("name=integral_rule_info", "����4");
		webtest.type("name=integral_rule_start_time", "2020-11-20 15:08");
		webtest.type("name=integral_rule_end_time", "2020-12-20 15:08");
		webtest.click("xpath=//a[@href='#integral_rule_c']");
		webtest.type("name=shopping_amount", "500");
		webtest.type("name=integral_num", "5");
		webtest.click("xpath=//a[@href='#integral_rule_b']");
		webtest.selectByValue("name=integral_rule_user_type", "user_group");
		webtest.click("xpath=//label[contains(text(),'��ͨ��Ա')]");
		webtest.click("xpath=//a[@href='#integral_rule_d']");
		webtest.selectByValue("name=integral_rule_goods_type", "class_goods");
		webtest.click("xpath=//label[contains(text(),'���õ���')]");
		webtest.click("xpath=//label[contains(text(),'�����')]");
		webtest.click("xpath=//button[@type='submit']");
	}
	@Test
	public void test5_addselecgood2() throws InterruptedException {
		testLogin();
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'�ͻ�����')]");
		webtest.mouseToElement("xpath=//a[contains(text(),'�������')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'���ֹ���')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'����¹���')]");
		webtest.type("name=integral_rule_name", "����4");
		webtest.type("name=integral_rule_info", "����4");
		webtest.type("name=integral_rule_start_time", "2020-11-20 15:08");
		webtest.type("name=integral_rule_end_time", "2020-12-20 15:08");
		webtest.click("xpath=//a[@href='#integral_rule_c']");
		webtest.type("name=shopping_amount", "500");
		webtest.type("name=integral_num", "5");
		webtest.click("xpath=//a[@href='#integral_rule_b']");
		webtest.selectByValue("name=integral_rule_user_type", "user_group");
		webtest.click("xpath=//label[contains(text(),'��ͨ��Ա')]");
		webtest.click("xpath=//a[@href='#integral_rule_d']");
		webtest.selectByValue("name=integral_rule_goods_type", "brand_goods");
		webtest.click("xpath=//button[@type='submit']");
	}

}
