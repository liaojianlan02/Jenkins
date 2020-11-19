package com.webtest.demo;

import org.testng.annotations.Test;

import com.webest.core.BaseTest;

public class Demo1 extends BaseTest{
	/*
	 * 运营管理模块
	 * 
	 */
	//@Test
	public void test1() throws InterruptedException {
		testLogin();
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'运营管理')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'优惠促销规则')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'添加新规则')]");
		webtest.type("name=promotions_name", "促销规则1");
		webtest.type("name=promotions_info", "促销规则1");
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
		webtest.click("xpath=//a[contains(text(),'运营管理')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'优惠促销规则')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'添加新规则')]");
		webtest.type("name=promotions_name", "促销规则2");
		webtest.type("name=promotions_info", "促销规则2");
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
		webtest.click("xpath=//a[contains(text(),'运营管理')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'优惠促销规则')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'添加新规则')]");
		webtest.type("name=promotions_name", "促销规则2");
		webtest.type("name=promotions_info", "促销规则2");
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
		webtest.click("xpath=//a[contains(text(),'运营管理')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'优惠促销规则')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'添加新规则')]");
		webtest.type("name=promotions_name", "促销规则2");
		webtest.type("name=promotions_info", "促销规则2");
		webtest.type("name=promotions_start_time", "2020-11-20 15:08");
		webtest.type("name=promotions_end_time", "2020-12-20 15:08");
		webtest.selectByValue("name=rule_state", "2");
		webtest.click("xpath=//a[@href='#promotions_c']");
		webtest.type("name=shopping_amount", "500");
		webtest.type("name=shopping_discount","20");
		webtest.selectByValue("name=discount_type", "2");
		webtest.click("xpath=//a[@href='#promotions_b']");
		webtest.selectByValue("name=promotions_user_type", "user_group");
		webtest.click("xpath=//label[contains(text(),'普通会员')]");
		webtest.click("xpath=//button[@type='submit']");
	}
	//@Test
	public void test1_addcustom2() throws InterruptedException {
		testLogin();
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'运营管理')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'优惠促销规则')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'添加新规则')]");
		webtest.type("name=promotions_name", "促销规则2");
		webtest.type("name=promotions_info", "促销规则2");
		webtest.type("name=promotions_start_time", "2020-11-20 15:08");
		webtest.type("name=promotions_end_time", "2020-12-20 15:08");
		webtest.selectByValue("name=rule_state", "2");
		webtest.click("xpath=//a[@href='#promotions_c']");
		webtest.type("name=shopping_amount", "500");
		webtest.type("name=shopping_discount","20");
		webtest.selectByValue("name=discount_type", "2");
		webtest.click("xpath=//a[@href='#promotions_b']");
		webtest.selectByValue("name=promotions_user_type", "user_group");
		webtest.click("xpath=//label[contains(text(),'普通顾客')]");
		webtest.click("xpath=//button[@type='submit']");
	}
	@Test
	public void test1_addgood() throws InterruptedException {
		testLogin();
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'运营管理')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'优惠促销规则')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'添加新规则')]");
		webtest.type("name=promotions_name", "促销规则2");
		webtest.type("name=promotions_info", "促销规则2");
		webtest.type("name=promotions_start_time", "2020-11-20 15:08");
		webtest.type("name=promotions_end_time", "2020-12-20 15:08");
		webtest.selectByValue("name=rule_state", "2");
		webtest.click("xpath=//a[@href='#promotions_c']");
		webtest.type("name=shopping_amount", "500");
		webtest.type("name=shopping_discount","20");
		webtest.selectByValue("name=discount_type", "2");
		webtest.click("xpath=//a[@href='#promotions_b']");
		webtest.selectByValue("name=promotions_user_type", "user_group");
		webtest.click("xpath=//label[contains(text(),'普通顾客')]");
		webtest.click("xpath=//a[@href='#promotions_d']");
		webtest.selectByValue("name=promotions_goods_type", "class_goods");
		webtest.click("xpath=//label[contains(text(),'家用电器')]");
		webtest.click("xpath=//label[contains(text(),'电冰箱')]");
		webtest.click("xpath=//button[@type='submit']");
	}
	//@Test
	public void test2() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'运营管理')]");
		webtest.click("xpath=//a[contains(text(),'优惠券')]");
		webtest.click("xpath=//a[contains(text(),'添加优惠券')]");
		webtest.type("name=coupon_name", "优惠打折扣");
		webtest.type("name=coupon_info", "给所有客户分发优惠券");
		webtest.click("xpath=//a[contains(text(),'优惠规则')]");
		webtest.type("name=shopping_amount", "500");
		webtest.type("name=shopping_discount", "100");
		webtest.click("xpath=//a[contains(text(),'获取规则')]");
		webtest.type("name=get_coupon_start_time", "2020-11-20 15:08");
		webtest.type("name=get_coupon_end_time", "2020-11-20 15:08");
		webtest.type("name=get_shopping_amount", "500");
		webtest.click("xpath=//a[contains(text(),'使用规则')]");
		webtest.type("name=coupon_start_time", "2020-11-20 15:08");
		webtest.type("name=coupon_end_time", "2020-12-20 15:08");
		webtest.click("xpath=//button[@type='submit']");
	}
	//@Test
	public void test3() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'运营管理')]");
		webtest.click("xpath=//a[contains(text(),'优惠券')]");
		webtest.click("xpath=//a[contains(text(),'添加优惠券')]");
		webtest.type("name=coupon_name", "优惠打折扣1");
		webtest.type("name=coupon_info", "给所有客户分发优惠券1");
		webtest.selectByValue("name=coupon_state","2" );
		webtest.click("xpath=//a[contains(text(),'优惠规则')]");
		webtest.type("name=shopping_amount", "500");
		webtest.type("name=shopping_discount", "100");
		webtest.click("xpath=//a[contains(text(),'获取规则')]");
		webtest.type("name=get_coupon_start_time", "2020-11-20 15:08");
		webtest.type("name=get_coupon_end_time", "2020-11-20 15:08");
		webtest.type("name=get_shopping_amount", "500");
		webtest.click("xpath=//a[contains(text(),'使用规则')]");
		webtest.type("name=coupon_start_time", "2020-11-20 15:08");
		webtest.type("name=coupon_end_time", "2020-12-20 15:08");
		webtest.click("xpath=//button[@type='submit']");
	}
	//@Test
	public void test4() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'运营管理')]");
		webtest.click("xpath=//a[contains(text(),'优惠券')]");
		webtest.click("xpath=//a[contains(text(),'添加优惠券')]");
		webtest.type("name=coupon_name", "优惠打折扣1");
		webtest.type("name=coupon_info", "给所有客户分发优惠券1");
		webtest.selectByValue("name=coupon_state","2" );
		webtest.click("xpath=//a[contains(text(),'优惠规则')]");
		webtest.type("name=shopping_amount", "500");
		webtest.type("name=shopping_discount", "100");
		webtest.click("xpath=//a[contains(text(),'获取规则')]");
		webtest.type("name=get_coupon_start_time", "2020-11-20 15:08");
		webtest.type("name=get_coupon_end_time", "2020-11-20 15:08");
		webtest.selectByValue("name=get_coupon_type","click" );
		webtest.click("xpath=//a[contains(text(),'使用规则')]");
		webtest.type("name=coupon_start_time", "2020-11-20 15:08");
		webtest.type("name=coupon_end_time", "2020-12-20 15:08");
		webtest.click("xpath=//button[@type='submit']");
	}
	//@Test
	public void test5() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'运营管理')]");
		webtest.click("xpath=//a[contains(text(),'优惠券')]");
		webtest.click("xpath=//a[contains(text(),'添加优惠券')]");
		webtest.type("name=coupon_name", "优惠打折扣1");
		webtest.type("name=coupon_info", "给所有客户分发优惠券1");
		webtest.selectByValue("name=coupon_state","2" );
		webtest.click("xpath=//a[contains(text(),'优惠规则')]");
		webtest.type("name=shopping_amount", "500");
		webtest.type("name=shopping_discount", "100");
		webtest.click("xpath=//a[contains(text(),'获取规则')]");
		webtest.type("name=get_coupon_start_time", "2020-11-20 15:08");
		webtest.type("name=get_coupon_end_time", "2020-11-20 15:08");
		webtest.selectByValue("name=get_coupon_type","click" );
		webtest.selectByValue("name=get_user_type","user_group");
		webtest.click("xpath=//input[@value='1']");
		webtest.click("xpath=//a[contains(text(),'使用规则')]");
		webtest.type("name=coupon_start_time", "2020-11-20 15:08");
		webtest.type("name=coupon_end_time", "2020-12-20 15:08");
		webtest.click("xpath=//button[@type='submit']");
	}
	//@Test
	public void test6() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'运营管理')]");
		webtest.click("xpath=//a[contains(text(),'优惠券')]");
		webtest.click("xpath=//a[contains(text(),'添加优惠券')]");
		webtest.type("name=coupon_name", "优惠打折扣2");
		webtest.type("name=coupon_info", "给所有客户分发优惠券2");
		webtest.selectByValue("name=coupon_state","1" );
		webtest.click("xpath=//a[contains(text(),'优惠规则')]");
		webtest.type("name=shopping_amount", "500");
		webtest.type("name=shopping_discount", "100");
		webtest.click("xpath=//a[contains(text(),'获取规则')]");
		webtest.type("name=get_coupon_start_time", "2020-11-20 15:08");
		webtest.type("name=get_coupon_end_time", "2020-11-20 15:08");
		webtest.selectByValue("name=get_coupon_type","register" );
		webtest.click("xpath=//a[contains(text(),'使用规则')]");
		webtest.type("name=coupon_start_time", "2020-11-20 15:08");
		webtest.type("name=coupon_end_time", "2020-12-20 15:08");
		webtest.click("xpath=//button[@type='submit']");
	}
	//@Test
	public void test7() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'运营管理')]");
		webtest.click("xpath=//a[contains(text(),'优惠券')]");
		webtest.click("xpath=//a[contains(text(),'添加优惠券')]");
		webtest.type("name=coupon_name", "优惠打折扣2");
		webtest.type("name=coupon_info", "给所有客户分发优惠券2");
		webtest.selectByValue("name=coupon_state","1" );
		webtest.click("xpath=//a[contains(text(),'优惠规则')]");
		webtest.type("name=shopping_amount", "500");
		webtest.type("name=shopping_discount", "100");
		webtest.click("xpath=//a[contains(text(),'获取规则')]");
		webtest.type("name=get_coupon_start_time", "2020-11-20 15:08");
		webtest.type("name=get_coupon_end_time", "2020-11-20 15:08");
		webtest.selectByValue("name=get_coupon_type","register" );
		webtest.click("xpath=//a[contains(text(),'使用规则')]");
		webtest.type("name=coupon_start_time", "2020-11-20 15:08");
		webtest.type("name=coupon_end_time", "2020-12-20 15:08");
		webtest.selectByValue("name=coupon_goods_type","individual_goods" );
		webtest.type("name=individual_goods_keyword", "美的（Midea）BCD-525WKPZM(E) 星际银 525升对开门电冰箱");
		webtest.click("xpath=//button[@type='button']");
		webtest.click("xpath=//button[@type='submit']");	
	}
	//@Test
	public void test8() {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'运营管理')]");
		webtest.click("xpath=//a[contains(text(),'优惠券')]");
		webtest.click("xpath=//a[contains(text(),'添加优惠券')]");
		webtest.type("name=coupon_name", "优惠打折扣3");
		webtest.type("name=coupon_info", "给所有客户分发优惠券3");
		webtest.selectByValue("name=coupon_state","1" );
		webtest.click("xpath=//a[contains(text(),'优惠规则')]");
		webtest.type("name=shopping_amount", "500");
		webtest.type("name=shopping_discount", "100");
		webtest.click("xpath=//a[contains(text(),'获取规则')]");
		webtest.type("name=get_coupon_start_time", "2020-11-20 15:08");
		webtest.type("name=get_coupon_end_time", "2020-11-20 15:08");
		webtest.selectByValue("name=get_coupon_type","register" );
		webtest.click("xpath=//a[contains(text(),'使用规则')]");
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
		webtest.click("xpath=//a[contains(text(),'运营管理')]");
		webtest.click("xpath=//a[contains(text(),'优惠券')]");
		webtest.click("xpath=//a[contains(text(),'添加优惠券')]");
		webtest.type("name=coupon_name", "优惠打折扣4");
		webtest.type("name=coupon_info", "给所有客户分发优惠券4");
		webtest.selectByValue("name=coupon_state","1" );
		webtest.click("xpath=//a[contains(text(),'优惠规则')]");
		webtest.type("name=shopping_amount", "500");
		webtest.type("name=shopping_discount", "100");
		webtest.click("xpath=//a[contains(text(),'获取规则')]");
		webtest.type("name=get_coupon_start_time", "2020-11-20 15:08");
		webtest.type("name=get_coupon_end_time", "2020-11-20 15:08");
		webtest.selectByValue("name=get_coupon_type","click" );
		webtest.selectByValue("name=get_user_type","user_group" );
		webtest.isChecked("xpath=//input[@value='1']");
		webtest.click("xpath=//a[contains(text(),'使用规则')]");
		webtest.type("name=coupon_start_time", "2020-11-20 15:08");
		webtest.type("name=coupon_end_time", "2020-12-20 15:08");
		webtest.selectByValue("name=coupon_goods_type","brand_goods" );
		webtest.click("xpath=//button[@type='submit']");
	}
	//@Test
	public void test10() throws InterruptedException {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'运营管理')]");
		webtest.mouseToElement("xpath=//a[contains(text(),'专题管理')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'专题设置')]");
		webtest.click("xpath=//a[contains(text(),'添加专题')]");
		webtest.type("name=theme_name", "生活大爆炸");
		webtest.type("name=theme_sign", "生活记号");
		webtest.selectByValue("name=theme_template","default");
		webtest.click("xpath=//a[contains(text(),'搜索引擎优化')]");
		webtest.type("name=theme_extend_name", "生活大爆炸姊妹篇");
		webtest.type("name=theme_keywords", "乐趣");
		webtest.type("name=theme_description", "要对生活充满乐趣");
		webtest.click("xpath=//button[@type='submit']");
	}
	//@Test
	public void test11() throws InterruptedException {
		testLogin();
		webtest.click("xpath=//a[contains(text(),'运营管理')]");
		webtest.mouseToElement("xpath=//a[contains(text(),'专题管理')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(text(),'专题设置')]");
		webtest.click("xpath=//a[contains(text(),'添加专题')]");
		webtest.type("name=theme_name", "生活大爆炸1");
		webtest.type("name=theme_sign", "生活记号1");
		webtest.selectByValue("name=theme_template","default");
		webtest.selectByValue("name=theme_state","2");
		webtest.click("xpath=//a[contains(text(),'搜索引擎优化')]");
		webtest.type("name=theme_extend_name", "生活大爆炸姊妹篇1");
		webtest.type("name=theme_keywords", "乐趣1");
		webtest.type("name=theme_description", "要对生活充满乐趣1");
		webtest.click("xpath=//button[@type='submit']");
	}

}
