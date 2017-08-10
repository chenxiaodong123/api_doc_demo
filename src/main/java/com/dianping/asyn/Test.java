package com.dianping.asyn;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.Future;

/**
 * TODO: 类描述
 * xiaodong.chen@meituan.com
 * 2017/7/25
 */
@Service
public class Test {

    @Resource
    private Test2 test2;

    @Async
    public void test() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("test");
        int b = 1/0;
    }

    @Async
    public Future<Integer> test1() {
        test2.test();
        test();
        Test2.test_static();
        System.out.println("test1");
        return new AsyncResult<Integer>(1);
    }
}
