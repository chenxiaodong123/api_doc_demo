package com.dianping.asyn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.Future;

/**
 * TODO: 类描述
 * xiaodong.chen@meituan.com
 * 2017/7/25
 */
public class AsynTest {

    public static void main(String[] args) throws Exception{
        //  总结：
        //  1. 需要配置task:annotation注解
        //  2. 同一个类的方法的相互调用， Aysn注解不起作用
        //  3. 静态方法， Aysn也不起作用
        //  4. 使用AsyncResult处理获得返回结果
        //
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:spring/appcontext-core.xml");
        Test test = applicationContext.getBean(Test.class);
        Future<Integer> future = test.test1();
        System.out.println("main");
        Integer a = future.get();
        System.out.println(a);

    }

}
