package com.webtest.demo;

import org.testng.annotations.Test;

import com.webest.core.BaseTest;

public class Demo extends BaseTest {
	/*
	 * 
	 * 客户管理模块
	 */
	// 实现管理客户中的添加新顾客
	// @Test

	public void test1() throws InterruptedException {
		testLogin();
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'客户管理')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'管理客户')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'添加新客户')]");
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
		webtest.click("xpath=//a[contains(text(),'客户管理')]");
		webtest.click("xpath=//a[contains(text(),'管理客户')]");
		webtest.click("xpath=//a[contains(text(),'添加新客户')]");
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

	// 实现客户扩展信息中的添加扩展信息
	// @Test
	public void test2() throws InterruptedException {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'客户管理')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'客户扩展信息')]");
		webtest.click("xpath=//a[contains(text(),'添加扩展信息')]");
		webtest.type("name=field_name", "demo2");
		webtest.type("name=field_title", "所属省份");
		Thread.sleep(3000);
		webtest.selectByValue("name=field_type", "checkbox");
		webtest.type("name=field_radio_checkbox_select", "1=北京" + "\n" + "2=河北" + "\n" + "3=广西");
		webtest.click("xpath=//button[@type='submit']");
	}

	// @Test
	public void test2_addchecbox() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'客户管理')]");
		webtest.click("xpath=//a[contains(text(),'客户扩展信息')]");
		webtest.click("xpath=//a[contains(text(),'添加扩展信息')]");
		webtest.type("name=field_name", "demo2");
		webtest.type("name=field_title", "所属省份");
		webtest.selectByValue("name=field_type", "checkbox");
		webtest.type("name=field_radio_checkbox_select", "1=北京" + "\n" + "2=河北" + "\n" + "3=广西");
		webtest.click("xpath=//input[@value='2']");
		webtest.click("xpath=//button[@type='submit']");
	}

	// @Test
	public void test2_addradio() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'客户管理')]");
		webtest.click("xpath=//a[contains(text(),'客户扩展信息')]");
		webtest.click("xpath=//a[contains(text(),'添加扩展信息')]");
		webtest.type("name=field_name", "demo3");
		webtest.type("name=field_title", "性别");
		webtest.selectByValue("name=field_type", "radio");
		webtest.type("name=field_radio_checkbox_select", "1=男 " + "\n" + "2=女");
		webtest.click("xpath=//button[@type='submit']");

	}

	// @Test
	public void test2_addradioClose() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'客户管理')]");
		webtest.click("xpath=//a[contains(text(),'客户扩展信息')]");
		webtest.click("xpath=//a[contains(text(),'添加扩展信息')]");
		webtest.type("name=field_name", "demo4");
		webtest.type("name=field_title", "职业");
		webtest.selectByValue("name=field_type", "radio");
		webtest.type("name=field_radio_checkbox_select", "1=学生 " + "\n" + "2=老师");
		webtest.click("xpath=//input[@value='2']");
		webtest.click("xpath=//label[contains(text(),'关闭')]");
		webtest.click("xpath=//button[@type='submit']");
	}

	// @Test
	public void test3() throws InterruptedException {
		testLogin();
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'客户管理')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'客户扩展信息')]");
		webtest.click("xpath=//a[contains(text(),'添加扩展信息')]");
		webtest.type("name=field_name", "demo5");
		webtest.type("name=field_title", "出生年份");
		Thread.sleep(3000);
		webtest.selectByValue("name=field_type", "select");
		webtest.type("name=field_radio_checkbox_select",
				"1=1998" + "\n" + "2=1999" + "\n" + "3=2000" + "\n" + "4=2001" + "\n" + "5=2002");
		webtest.click("xpath=//button[@type='submit']");
	}

	//@Test
	public void test3_addselectClose() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'客户管理')]");
		webtest.click("xpath=//a[contains(text(),'客户扩展信息')]");
		webtest.click("xpath=//a[contains(text(),'添加扩展信息')]");
		webtest.type("name=field_name", "demo6");
		webtest.type("name=field_title", "出生月份");
		webtest.selectByValue("name=field_type", "select");
		webtest.type("name=field_radio_checkbox_select",
				"1=1月" + "\n" + "2=2月" + "\n" + "3=3月" + "\n" + "4=4月" + "\n" + "5=5月" + "6=6月" + "\n" + "7=7月" + "\n"
						+ "8=8月" + "\n" + "9=9月" + "\n" + "10=10月" + "\n" + "11=11月" + "\n" + "12=12月");
		webtest.click("xpath=//label[contains(text(),'关闭')]");
		webtest.click("xpath=//button[@type='submit']");
	}
	//@Test
	public void test3_addtext() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'客户管理')]");
		webtest.click("xpath=//a[contains(text(),'客户扩展信息')]");
		webtest.click("xpath=//a[contains(text(),'添加扩展信息')]");
		webtest.type("name=field_name", "demo7");
		webtest.type("name=field_title", "最喜欢的明星");
		webtest.selectByValue("name=field_type", "text");
		webtest.click("xpath=//input[@value='2']");
		webtest.click("xpath=//button[@type='submit']");
	}
	//@Test
	public void test3_addtextClose() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'客户管理')]");
		webtest.click("xpath=//a[contains(text(),'客户扩展信息')]");
		webtest.click("xpath=//a[contains(text(),'添加扩展信息')]");
		webtest.type("name=field_name", "demo8");
		webtest.type("name=field_title", "最喜欢的运动");
		webtest.selectByValue("name=field_type", "text");
		webtest.click("xpath=//label[contains(text(),'关闭')]");
		webtest.click("xpath=//button[@type='submit']");
	}
	//@Test
	public void test3_addtextarea() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'客户管理')]");
		webtest.click("xpath=//a[contains(text(),'客户扩展信息')]");
		webtest.click("xpath=//a[contains(text(),'添加扩展信息')]");
		webtest.type("name=field_name", "demo9");
		webtest.type("name=field_title", "家庭详细住址");
		webtest.selectByValue("name=field_type", "textarea");
		webtest.click("xpath=//input[@value='2']");
		
		webtest.click("xpath=//button[@type='submit']");
	}
	//@Test
	public void test3_addtextareaClose() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'客户管理')]");
		webtest.click("xpath=//a[contains(text(),'客户扩展信息')]");
		webtest.click("xpath=//a[contains(text(),'添加扩展信息')]");
		webtest.type("name=field_name", "demo10");
		webtest.type("name=field_title", "高中学校信息");
		webtest.selectByValue("name=field_type", "textarea");
		webtest.click("xpath=//label[contains(text(),'关闭')]");
		webtest.click("xpath=//button[@type='submit']");
	}

	// @Test
	public void test4() throws InterruptedException {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'客户管理')]");
		webtest.click("xpath=//a[contains(text(),'管理客户组')]");
		webtest.click("xpath=//a[contains(text(),'添加客户组')]");
		webtest.type("name=user_group_name", "普通客户");
		webtest.type("name=integral_num_start", "0");
		webtest.type("name=integral_num_end", "100");
		webtest.click("name=integral_num_state");
		webtest.click("xpath=//button[@type='submit']");
	}
	//@Test
	public void test4_add() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'客户管理')]");
		webtest.click("xpath=//a[contains(text(),'管理客户组')]");
		webtest.click("xpath=//a[contains(text(),'添加客户组')]");
		webtest.type("name=user_group_name", "高级会员");
		webtest.type("name=integral_num_start", "200");
		webtest.type("name=integral_num_end", "500");
		webtest.click("name=integral_num_state");
		webtest.click("xpath=//button[@type='submit']");
	}

   // @Test
	public void test5() throws InterruptedException {
		testLogin();
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'客户管理')]");
		webtest.mouseToElement("xpath=//a[contains(text(),'管理积分')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'积分规则')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'添加新规则')]");
		webtest.type("name=integral_rule_name", "打折规则");
		webtest.type("name=integral_rule_info", "对所有商品都进行一定的打折");
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
		webtest.click("xpath=//a[contains(text(),'客户管理')]");
		webtest.mouseToElement("xpath=//a[contains(text(),'管理积分')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'积分规则')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'添加新规则')]");
		webtest.type("name=integral_rule_name", "规则1");
		webtest.type("name=integral_rule_info", "不许盗窃，有监控");
		webtest.type("name=integral_rule_start_time", "2020-11-20 15:08");
		webtest.type("name=integral_rule_end_time", "2020-12-20 15:08");
		webtest.selectByValue("name=integral_rule_state", "2");
		webtest.click("xpath=//a[@href='#integral_rule_c']");
		webtest.type("name=shopping_amount", "500");
		webtest.type("name=integral_num", "2");
		webtest.click("xpath=//button[@type='submit']");
	}
	//@Test//实现积分规则
	public void test5_addruleintegral() throws InterruptedException {
		testLogin();
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'客户管理')]");
		webtest.mouseToElement("xpath=//a[contains(text(),'管理积分')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'积分规则')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'添加新规则')]");
		webtest.type("name=integral_rule_name", "规则2");
		webtest.type("name=integral_rule_info", "看好个人用品，谨防小偷");
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
		webtest.click("xpath=//a[contains(text(),'客户管理')]");
		webtest.mouseToElement("xpath=//a[contains(text(),'管理积分')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'积分规则')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'添加新规则')]");
		webtest.type("name=integral_rule_name", "规则3");
		webtest.type("name=integral_rule_info", "不可同时登录一个账户");
		webtest.type("name=integral_rule_start_time", "2020-11-20 15:08");
		webtest.type("name=integral_rule_end_time", "2020-12-20 15:08");
		webtest.click("xpath=//a[@href='#integral_rule_c']");
		webtest.type("name=shopping_amount", "500");
		webtest.type("name=integral_num", "5");
		webtest.click("xpath=//a[@href='#integral_rule_b']");
		webtest.selectByValue("name=integral_rule_user_type", "user_group");
		webtest.click("xpath=//label[contains(text(),'普通会员')]");
		webtest.click("xpath=//button[@type='submit']");
	}
	//@Test//个性化分组中普通顾客的选择
	public void test5_addselectcustomergroup1() throws InterruptedException {
		testLogin();
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'客户管理')]");
		webtest.mouseToElement("xpath=//a[contains(text(),'管理积分')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'积分规则')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'添加新规则')]");
		webtest.type("name=integral_rule_name", "规则3");
		webtest.type("name=integral_rule_info", "不可同时登录一个账户");
		webtest.type("name=integral_rule_start_time", "2020-11-20 15:08");
		webtest.type("name=integral_rule_end_time", "2020-12-20 15:08");
		webtest.click("xpath=//a[@href='#integral_rule_c']");
		webtest.type("name=shopping_amount", "500");
		webtest.type("name=integral_num", "5");
		webtest.click("xpath=//a[@href='#integral_rule_b']");
		webtest.selectByValue("name=integral_rule_user_type", "user_group");
		webtest.click("xpath=//label[contains(text(),'普通顾客')]");
		webtest.click("xpath=//button[@type='submit']");
	}
	//@Test//个性化分组中高级会员的选择
	public void test5_addselectcustomergroup2() throws InterruptedException {
		testLogin();
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'客户管理')]");
		webtest.mouseToElement("xpath=//a[contains(text(),'管理积分')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'积分规则')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'添加新规则')]");
		webtest.type("name=integral_rule_name", "规则3");
		webtest.type("name=integral_rule_info", "不可同时登录一个账户");
		webtest.type("name=integral_rule_start_time", "2020-11-20 15:08");
		webtest.type("name=integral_rule_end_time", "2020-12-20 15:08");
		webtest.click("xpath=//a[@href='#integral_rule_c']");
		webtest.type("name=shopping_amount", "500");
		webtest.type("name=integral_num", "5");
		webtest.click("xpath=//a[@href='#integral_rule_b']");
		webtest.selectByValue("name=integral_rule_user_type", "user_group");
		webtest.click("xpath=//label[contains(text(),'高级会员')]");
		webtest.click("xpath=//button[@type='submit']");
	}
	//@Test
	public void test5_addselectgoods1() throws InterruptedException {
		testLogin();
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'客户管理')]");
		webtest.mouseToElement("xpath=//a[contains(text(),'管理积分')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'积分规则')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'添加新规则')]");
		webtest.type("name=integral_rule_name", "规则4");
		webtest.type("name=integral_rule_info", "规则4");
		webtest.type("name=integral_rule_start_time", "2020-11-20 15:08");
		webtest.type("name=integral_rule_end_time", "2020-12-20 15:08");
		webtest.click("xpath=//a[@href='#integral_rule_c']");
		webtest.type("name=shopping_amount", "500");
		webtest.type("name=integral_num", "5");
		webtest.click("xpath=//a[@href='#integral_rule_b']");
		webtest.selectByValue("name=integral_rule_user_type", "user_group");
		webtest.click("xpath=//label[contains(text(),'普通会员')]");
		webtest.click("xpath=//a[@href='#integral_rule_d']");
		webtest.selectByValue("name=integral_rule_goods_type", "class_goods");
		webtest.click("xpath=//label[contains(text(),'家用电器')]");
		webtest.click("xpath=//label[contains(text(),'电冰箱')]");
		webtest.click("xpath=//button[@type='submit']");
	}
	@Test
	public void test5_addselecgood2() throws InterruptedException {
		testLogin();
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'客户管理')]");
		webtest.mouseToElement("xpath=//a[contains(text(),'管理积分')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'积分规则')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'添加新规则')]");
		webtest.type("name=integral_rule_name", "规则4");
		webtest.type("name=integral_rule_info", "规则4");
		webtest.type("name=integral_rule_start_time", "2020-11-20 15:08");
		webtest.type("name=integral_rule_end_time", "2020-12-20 15:08");
		webtest.click("xpath=//a[@href='#integral_rule_c']");
		webtest.type("name=shopping_amount", "500");
		webtest.type("name=integral_num", "5");
		webtest.click("xpath=//a[@href='#integral_rule_b']");
		webtest.selectByValue("name=integral_rule_user_type", "user_group");
		webtest.click("xpath=//label[contains(text(),'普通会员')]");
		webtest.click("xpath=//a[@href='#integral_rule_d']");
		webtest.selectByValue("name=integral_rule_goods_type", "brand_goods");
		webtest.click("xpath=//button[@type='submit']");
	}

}
