package com.dianping.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TODO: 类描述
 * xiaodong.chen@meituan.com
 * 2017/7/26
 */
public class TestMain1 {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext
                ("classpath*:spring/appcontext-core.xml");
        TestMain testMain = applicationContext.getBean(TestMain.class);
        testMain.say();
    }
}
