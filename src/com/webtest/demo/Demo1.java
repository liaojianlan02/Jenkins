package com.webtest.demo;

import org.testng.annotations.Test;

import com.webest.core.BaseTest;

public class Demo1 extends BaseTest{
	/*
	 * ��Ӫ����ģ��
	 * 
	 */
	//@Test
	public void test1() throws InterruptedException {
		testLogin();
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'��Ӫ����')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'�Żݴ�������')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'����¹���')]");
		webtest.type("name=promotions_name", "��������1");
		webtest.type("name=promotions_info", "��������1");
		webtest.type("name=promotions_start_time", "2020-11-20 15:08");
		webtest.type("name=promotions_end_time", "2020-12-20 15:08");
		webtest.click("xpath=//a[@href='#promotions_c']");
		webtest.type("name=shopping_amount", "500");
		webtest.type("name=shopping_discount","100");
		webtest.click("xpath=//button[@type='submit']");	
	}
	//@Test
	public void test1_Close() throws InterruptedException {
		testLogin();
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'��Ӫ����')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'�Żݴ�������')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'����¹���')]");
		webtest.type("name=promotions_name", "��������2");
		webtest.type("name=promotions_info", "��������2");
		webtest.type("name=promotions_start_time", "2020-11-20 15:08");
		webtest.type("name=promotions_end_time", "2020-12-20 15:08");
		webtest.selectByValue("name=rule_state", "2");
		webtest.click("xpath=//a[@href='#promotions_c']");
		webtest.type("name=shopping_amount", "500");
		webtest.type("name=shopping_discount","100");
		webtest.click("xpath=//button[@type='submit']");
	}
	//@Test
	public void test1_discountrule() throws InterruptedException {
		testLogin();
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'��Ӫ����')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'�Żݴ�������')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'����¹���')]");
		webtest.type("name=promotions_name", "��������2");
		webtest.type("name=promotions_info", "��������2");
		webtest.type("name=promotions_start_time", "2020-11-20 15:08");
		webtest.type("name=promotions_end_time", "2020-12-20 15:08");
		webtest.selectByValue("name=rule_state", "2");
		webtest.click("xpath=//a[@href='#promotions_c']");
		webtest.type("name=shopping_amount", "500");
		webtest.type("name=shopping_discount","20");
		webtest.selectByValue("name=discount_type", "2");
		webtest.click("xpath=//button[@type='submit']");
	}
	//@Test
	public void test1_addcustom1() throws InterruptedException {
		testLogin();
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'��Ӫ����')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'�Żݴ�������')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'����¹���')]");
		webtest.type("name=promotions_name", "��������2");
		webtest.type("name=promotions_info", "��������2");
		webtest.type("name=promotions_start_time", "2020-11-20 15:08");
		webtest.type("name=promotions_end_time", "2020-12-20 15:08");
		webtest.selectByValue("name=rule_state", "2");
		webtest.click("xpath=//a[@href='#promotions_c']");
		webtest.type("name=shopping_amount", "500");
		webtest.type("name=shopping_discount","20");
		webtest.selectByValue("name=discount_type", "2");
		webtest.click("xpath=//a[@href='#promotions_b']");
		webtest.selectByValue("name=promotions_user_type", "user_group");
		webtest.click("xpath=//label[contains(text(),'��ͨ��Ա')]");
		webtest.click("xpath=//button[@type='submit']");
	}
	//@Test
	public void test1_addcustom2() throws InterruptedException {
		testLogin();
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'��Ӫ����')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'�Żݴ�������')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'����¹���')]");
		webtest.type("name=promotions_name", "��������2");
		webtest.type("name=promotions_info", "��������2");
		webtest.type("name=promotions_start_time", "2020-11-20 15:08");
		webtest.type("name=promotions_end_time", "2020-12-20 15:08");
		webtest.selectByValue("name=rule_state", "2");
		webtest.click("xpath=//a[@href='#promotions_c']");
		webtest.type("name=shopping_amount", "500");
		webtest.type("name=shopping_discount","20");
		webtest.selectByValue("name=discount_type", "2");
		webtest.click("xpath=//a[@href='#promotions_b']");
		webtest.selectByValue("name=promotions_user_type", "user_group");
		webtest.click("xpath=//label[contains(text(),'��ͨ�˿�')]");
		webtest.click("xpath=//button[@type='submit']");
	}
	@Test
	public void test1_addgood() throws InterruptedException {
		testLogin();
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'��Ӫ����')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'�Żݴ�������')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'����¹���')]");
		webtest.type("name=promotions_name", "��������2");
		webtest.type("name=promotions_info", "��������2");
		webtest.type("name=promotions_start_time", "2020-11-20 15:08");
		webtest.type("name=promotions_end_time", "2020-12-20 15:08");
		webtest.selectByValue("name=rule_state", "2");
		webtest.click("xpath=//a[@href='#promotions_c']");
		webtest.type("name=shopping_amount", "500");
		webtest.type("name=shopping_discount","20");
		webtest.selectByValue("name=discount_type", "2");
		webtest.click("xpath=//a[@href='#promotions_b']");
		webtest.selectByValue("name=promotions_user_type", "user_group");
		webtest.click("xpath=//label[contains(text(),'��ͨ�˿�')]");
		webtest.click("xpath=//a[@href='#promotions_d']");
		webtest.selectByValue("name=promotions_goods_type", "class_goods");
		webtest.click("xpath=//label[contains(text(),'���õ���')]");
		webtest.click("xpath=//label[contains(text(),'�����')]");
		webtest.click("xpath=//button[@type='submit']");
	}
	//@Test
	public void test2() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'��Ӫ����')]");
		webtest.click("xpath=//a[contains(text(),'�Ż�ȯ')]");
		webtest.click("xpath=//a[contains(text(),'����Ż�ȯ')]");
		webtest.type("name=coupon_name", "�Żݴ��ۿ�");
		webtest.type("name=coupon_info", "�����пͻ��ַ��Ż�ȯ");
		webtest.click("xpath=//a[contains(text(),'�Żݹ���')]");
		webtest.type("name=shopping_amount", "500");
		webtest.type("name=shopping_discount", "100");
		webtest.click("xpath=//a[contains(text(),'��ȡ����')]");
		webtest.type("name=get_coupon_start_time", "2020-11-20 15:08");
		webtest.type("name=get_coupon_end_time", "2020-11-20 15:08");
		webtest.type("name=get_shopping_amount", "500");
		webtest.click("xpath=//a[contains(text(),'ʹ�ù���')]");
		webtest.type("name=coupon_start_time", "2020-11-20 15:08");
		webtest.type("name=coupon_end_time", "2020-12-20 15:08");
		webtest.click("xpath=//button[@type='submit']");
	}
	//@Test
	public void test3() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'��Ӫ����')]");
		webtest.click("xpath=//a[contains(text(),'�Ż�ȯ')]");
		webtest.click("xpath=//a[contains(text(),'����Ż�ȯ')]");
		webtest.type("name=coupon_name", "�Żݴ��ۿ�1");
		webtest.type("name=coupon_info", "�����пͻ��ַ��Ż�ȯ1");
		webtest.selectByValue("name=coupon_state","2" );
		webtest.click("xpath=//a[contains(text(),'�Żݹ���')]");
		webtest.type("name=shopping_amount", "500");
		webtest.type("name=shopping_discount", "100");
		webtest.click("xpath=//a[contains(text(),'��ȡ����')]");
		webtest.type("name=get_coupon_start_time", "2020-11-20 15:08");
		webtest.type("name=get_coupon_end_time", "2020-11-20 15:08");
		webtest.type("name=get_shopping_amount", "500");
		webtest.click("xpath=//a[contains(text(),'ʹ�ù���')]");
		webtest.type("name=coupon_start_time", "2020-11-20 15:08");
		webtest.type("name=coupon_end_time", "2020-12-20 15:08");
		webtest.click("xpath=//button[@type='submit']");
	}
	//@Test
	public void test4() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'��Ӫ����')]");
		webtest.click("xpath=//a[contains(text(),'�Ż�ȯ')]");
		webtest.click("xpath=//a[contains(text(),'����Ż�ȯ')]");
		webtest.type("name=coupon_name", "�Żݴ��ۿ�1");
		webtest.type("name=coupon_info", "�����пͻ��ַ��Ż�ȯ1");
		webtest.selectByValue("name=coupon_state","2" );
		webtest.click("xpath=//a[contains(text(),'�Żݹ���')]");
		webtest.type("name=shopping_amount", "500");
		webtest.type("name=shopping_discount", "100");
		webtest.click("xpath=//a[contains(text(),'��ȡ����')]");
		webtest.type("name=get_coupon_start_time", "2020-11-20 15:08");
		webtest.type("name=get_coupon_end_time", "2020-11-20 15:08");
		webtest.selectByValue("name=get_coupon_type","click" );
		webtest.click("xpath=//a[contains(text(),'ʹ�ù���')]");
		webtest.type("name=coupon_start_time", "2020-11-20 15:08");
		webtest.type("name=coupon_end_time", "2020-12-20 15:08");
		webtest.click("xpath=//button[@type='submit']");
	}
	//@Test
	public void test5() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'��Ӫ����')]");
		webtest.click("xpath=//a[contains(text(),'�Ż�ȯ')]");
		webtest.click("xpath=//a[contains(text(),'����Ż�ȯ')]");
		webtest.type("name=coupon_name", "�Żݴ��ۿ�1");
		webtest.type("name=coupon_info", "�����пͻ��ַ��Ż�ȯ1");
		webtest.selectByValue("name=coupon_state","2" );
		webtest.click("xpath=//a[contains(text(),'�Żݹ���')]");
		webtest.type("name=shopping_amount", "500");
		webtest.type("name=shopping_discount", "100");
		webtest.click("xpath=//a[contains(text(),'��ȡ����')]");
		webtest.type("name=get_coupon_start_time", "2020-11-20 15:08");
		webtest.type("name=get_coupon_end_time", "2020-11-20 15:08");
		webtest.selectByValue("name=get_coupon_type","click" );
		webtest.selectByValue("name=get_user_type","user_group");
		webtest.click("xpath=//input[@value='1']");
		webtest.click("xpath=//a[contains(text(),'ʹ�ù���')]");
		webtest.type("name=coupon_start_time", "2020-11-20 15:08");
		webtest.type("name=coupon_end_time", "2020-12-20 15:08");
		webtest.click("xpath=//button[@type='submit']");
	}
	//@Test
	public void test6() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'��Ӫ����')]");
		webtest.click("xpath=//a[contains(text(),'�Ż�ȯ')]");
		webtest.click("xpath=//a[contains(text(),'����Ż�ȯ')]");
		webtest.type("name=coupon_name", "�Żݴ��ۿ�2");
		webtest.type("name=coupon_info", "�����пͻ��ַ��Ż�ȯ2");
		webtest.selectByValue("name=coupon_state","1" );
		webtest.click("xpath=//a[contains(text(),'�Żݹ���')]");
		webtest.type("name=shopping_amount", "500");
		webtest.type("name=shopping_discount", "100");
		webtest.click("xpath=//a[contains(text(),'��ȡ����')]");
		webtest.type("name=get_coupon_start_time", "2020-11-20 15:08");
		webtest.type("name=get_coupon_end_time", "2020-11-20 15:08");
		webtest.selectByValue("name=get_coupon_type","register" );
		webtest.click("xpath=//a[contains(text(),'ʹ�ù���')]");
		webtest.type("name=coupon_start_time", "2020-11-20 15:08");
		webtest.type("name=coupon_end_time", "2020-12-20 15:08");
		webtest.click("xpath=//button[@type='submit']");
	}
	//@Test
	public void test7() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'��Ӫ����')]");
		webtest.click("xpath=//a[contains(text(),'�Ż�ȯ')]");
		webtest.click("xpath=//a[contains(text(),'����Ż�ȯ')]");
		webtest.type("name=coupon_name", "�Żݴ��ۿ�2");
		webtest.type("name=coupon_info", "�����пͻ��ַ��Ż�ȯ2");
		webtest.selectByValue("name=coupon_state","1" );
		webtest.click("xpath=//a[contains(text(),'�Żݹ���')]");
		webtest.type("name=shopping_amount", "500");
		webtest.type("name=shopping_discount", "100");
		webtest.click("xpath=//a[contains(text(),'��ȡ����')]");
		webtest.type("name=get_coupon_start_time", "2020-11-20 15:08");
		webtest.type("name=get_coupon_end_time", "2020-11-20 15:08");
		webtest.selectByValue("name=get_coupon_type","register" );
		webtest.click("xpath=//a[contains(text(),'ʹ�ù���')]");
		webtest.type("name=coupon_start_time", "2020-11-20 15:08");
		webtest.type("name=coupon_end_time", "2020-12-20 15:08");
		webtest.selectByValue("name=coupon_goods_type","individual_goods" );
		webtest.type("name=individual_goods_keyword", "���ģ�Midea��BCD-525WKPZM(E) �Ǽ��� 525���Կ��ŵ����");
		webtest.click("xpath=//button[@type='button']");
		webtest.click("xpath=//button[@type='submit']");	
	}
	//@Test
	public void test8() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'��Ӫ����')]");
		webtest.click("xpath=//a[contains(text(),'�Ż�ȯ')]");
		webtest.click("xpath=//a[contains(text(),'����Ż�ȯ')]");
		webtest.type("name=coupon_name", "�Żݴ��ۿ�3");
		webtest.type("name=coupon_info", "�����пͻ��ַ��Ż�ȯ3");
		webtest.selectByValue("name=coupon_state","1" );
		webtest.click("xpath=//a[contains(text(),'�Żݹ���')]");
		webtest.type("name=shopping_amount", "500");
		webtest.type("name=shopping_discount", "100");
		webtest.click("xpath=//a[contains(text(),'��ȡ����')]");
		webtest.type("name=get_coupon_start_time", "2020-11-20 15:08");
		webtest.type("name=get_coupon_end_time", "2020-11-20 15:08");
		webtest.selectByValue("name=get_coupon_type","register" );
		webtest.click("xpath=//a[contains(text(),'ʹ�ù���')]");
		webtest.type("name=coupon_start_time", "2020-11-20 15:08");
		webtest.type("name=coupon_end_time", "2020-12-20 15:08");
		webtest.selectByValue("name=coupon_goods_type","class_goods" );
		webtest.isChecked("xpath=//input[@value='1']");
		webtest.isChecked("xpath=//input[@value='30']");
		webtest.click("xpath=//button[@type='submit']");
	}
	//@Test
	public void test9() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'��Ӫ����')]");
		webtest.click("xpath=//a[contains(text(),'�Ż�ȯ')]");
		webtest.click("xpath=//a[contains(text(),'����Ż�ȯ')]");
		webtest.type("name=coupon_name", "�Żݴ��ۿ�4");
		webtest.type("name=coupon_info", "�����пͻ��ַ��Ż�ȯ4");
		webtest.selectByValue("name=coupon_state","1" );
		webtest.click("xpath=//a[contains(text(),'�Żݹ���')]");
		webtest.type("name=shopping_amount", "500");
		webtest.type("name=shopping_discount", "100");
		webtest.click("xpath=//a[contains(text(),'��ȡ����')]");
		webtest.type("name=get_coupon_start_time", "2020-11-20 15:08");
		webtest.type("name=get_coupon_end_time", "2020-11-20 15:08");
		webtest.selectByValue("name=get_coupon_type","click" );
		webtest.selectByValue("name=get_user_type","user_group" );
		webtest.isChecked("xpath=//input[@value='1']");
		webtest.click("xpath=//a[contains(text(),'ʹ�ù���')]");
		webtest.type("name=coupon_start_time", "2020-11-20 15:08");
		webtest.type("name=coupon_end_time", "2020-12-20 15:08");
		webtest.selectByValue("name=coupon_goods_type","brand_goods" );
		webtest.click("xpath=//button[@type='submit']");
	}
	//@Test
	public void test10() throws InterruptedException {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'��Ӫ����')]");
		webtest.mouseToElement("xpath=//a[contains(text(),'ר�����')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'ר������')]");
		webtest.click("xpath=//a[contains(text(),'���ר��')]");
		webtest.type("name=theme_name", "�����ը");
		webtest.type("name=theme_sign", "����Ǻ�");
		webtest.selectByValue("name=theme_template","default");
		webtest.click("xpath=//a[contains(text(),'���������Ż�')]");
		webtest.type("name=theme_extend_name", "�����ը���ƪ");
		webtest.type("name=theme_keywords", "��Ȥ");
		webtest.type("name=theme_description", "Ҫ�����������Ȥ");
		webtest.click("xpath=//button[@type='submit']");
	}
	//@Test
	public void test11() throws InterruptedException {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'��Ӫ����')]");
		webtest.mouseToElement("xpath=//a[contains(text(),'ר�����')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'ר������')]");
		webtest.click("xpath=//a[contains(text(),'���ר��')]");
		webtest.type("name=theme_name", "�����ը1");
		webtest.type("name=theme_sign", "����Ǻ�1");
		webtest.selectByValue("name=theme_template","default");
		webtest.selectByValue("name=theme_state","2");
		webtest.click("xpath=//a[contains(text(),'���������Ż�')]");
		webtest.type("name=theme_extend_name", "�����ը���ƪ1");
		webtest.type("name=theme_keywords", "��Ȥ1");
		webtest.type("name=theme_description", "Ҫ�����������Ȥ1");
		webtest.click("xpath=//button[@type='submit']");
	}

}
