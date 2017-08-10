package com.dianping.hystrix;

import lombok.extern.slf4j.Slf4j;

import java.io.InputStream;
import java.util.Properties;

/**
 * xiaodong.chen@meituan.com
 * 2017/7/15
 */
@Slf4j
public class HystrixConfig {

    public void init() {
        Properties prop = new Properties();
        InputStream in = null;
//        try {
            in = HystrixConfig.class.getClassLoader().getResourceAsStream("hystix.properties");
//            prop.load(in);
//            in.close();
//            System.setProperties(prop);    //这句话会抛异常： 在构建RequestMapping的时候
//        } catch (Exception e) {
//            log.error("something wrong", e);
//        }
    }

//    public static void main(String[] args) {
//        HystrixConfig hystrixConfig = new HystrixConfig();
//        hystrixConfig.init();
//    }
}
