package com.dianping.autowired;

import org.springframework.stereotype.Service;

/**
 * TODO: 类描述
 * xiaodong.chen@meituan.com
 * 2017/7/26
 */
@Service
public class TestB implements TestAutowired {
    public void say() {
        System.out.println("b");
    }
}
