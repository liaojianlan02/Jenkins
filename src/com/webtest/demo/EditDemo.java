package com.webtest.demo;

import org.testng.annotations.Test;

import com.webest.core.BaseTest;

public class EditDemo extends BaseTest{
	/**
	 * 对之前板块实现添加后又进行编辑
	 */
	//@Test
	public void test_editaddcustom() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'客户管理')]");
		webtest.click("xpath=//a[contains(text(),'管理客户')]");
		webtest.click("xpath=//a[@href='/admin/user/edit/6/other/1']");
		webtest.type("name=user_password", "123456");
		webtest.type("name=user_password_con", "123456");
		webtest.click("xpath=//label[contains(text(),'河北')]");
		webtest.type("name=demo7", "易烊千玺");
		webtest.type("name=demo9", "河北省石家庄市南二环东路");
		webtest.click("xpath=//button[contains(text(),'保存客户信息')]");
	}
	//@Test
	public void test_editaddcustomAdress() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'客户管理')]");
		webtest.click("xpath=//a[contains(text(),'管理客户')]");
		webtest.click("xpath=//a[@href='/admin/user/edit/6/other/1']");
		webtest.click("xpath=//a[@href='#user_b']");
		webtest.click("xpath=//button[contains(text(),'添加地址')]");
		webtest.type("name=true_name", "廖建兰");
		webtest.selectByValue("id=show_address_area", "35");
		webtest.type("name=address", "南二环东路20号河北师范大学");
		webtest.type("name=zip_code", "537100");
		webtest.type("name=mod_phone", "18377564491");
		webtest.click("xpath=//button[contains(text(),'修改')]");
		webtest.click("xpath=//button[contains(text(),'保存客户信息')]");
	}
	@Test
	public void test_editcustomextends() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'客户管理')]");
		webtest.click("xpath=//a[contains(text(),'客户扩展信息')]");
		webtest.click("xpath=//a[@href='/admin/user/editUserRegExtend/reg-e/15']");
		webtest.selectByValue("name=field_type", "checkbox");
		webtest.type("name=field_radio_checkbox_select",  "\n" + "4=天津" + "\n" + "5=上海");
		webtest.click("xpath=//button[contains(text(),'保存客户扩展信息')]");
	}
	@Test
	public void testeditcustomgroups1() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'客户管理')]");
		webtest.click("xpath=//a[contains(text(),'管理客户组')]");
		webtest.click("xpath=//a[@href='/admin/user/group/edit/8']");
		webtest.type("name=integral_num_start", "0");
		webtest.type("name=integral_num_end", "150");
		webtest.click("xpath=//button[contains(text(),'保存客户组信息')]");
	}
	@Test
	public void testeditcustomgroups2() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'客户管理')]");
		webtest.click("xpath=//a[contains(text(),'管理客户组')]");
		webtest.click("xpath=//a[@href='/admin/user/group/edit/1']");
		webtest.type("name=integral_num_start", "151");
		webtest.type("name=integral_num_end", "499");
		webtest.click("xpath=//button[contains(text(),'保存客户组信息')]");
	}
	@Test
	public void testeditcustomintegral() throws InterruptedException {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'客户管理')]");
		webtest.mouseToElement("xpath=//a[contains(text(),'管理积分')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'积分规则')]");
		webtest.click("xpath=//a[@href='/admin/user/integral/editIntegralRule/5']");
		webtest.type("name=integral_rule_info", "不可同时登录一个账户,若登录，将会强制退出");
		webtest.click("xpath=//button[contains(text(),'保存积分规则')]");
	}
	/**
	 * 运营管理模块
	 */
	
	@Test
	public void test_edit1() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'运营管理')]");
		webtest.click("xpath=//a[contains(text(),'优惠促销规则')]");
		webtest.click("xpath=//a[@href='/admin/goods/promotions/edit/7']");
		webtest.type("name=promotions_info", "促销规则1，对所有的商品都进行一定的促销打折");
		webtest.click("xpath=//button[contains(text(),'保存促销规则')]");
	}


}
