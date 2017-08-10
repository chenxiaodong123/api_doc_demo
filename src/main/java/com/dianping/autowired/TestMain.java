package com.dianping.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TODO: 类描述
 * xiaodong.chen@meituan.com
 * 2017/7/26
 */
@Service
public class TestMain {

    @Autowired
    List<TestAutowired> testList;

    public void say() {
        for (TestAutowired test : testList) {
            test.say();
        }
    }
}
