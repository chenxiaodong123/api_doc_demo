package com.dianping.asyn;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * TODO: 类描述
 * xiaodong.chen@meituan.com
 * 2017/7/25
 */
@Service
public class Test2 {
    @Async
    public void test() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("test2");
    }


    @Async
    public static void test_static() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("test2_static");
    }
}
