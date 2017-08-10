package com.dianping;

import com.dianping.dao.UserDao;
import com.dianping.data.User;
import com.google.common.collect.Lists;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * TODO: 类描述
 * xiaodong.chen@meituan.com
 * 2017/7/24
 */
public class UserTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring/appcontext-core.xml");
        UserDao userDao =  context.getBean(UserDao.class);

//        User user = new User("小明", "00");
        User user1 = new User("小明1", "111");
//        User user2 = new User("小明2", "222");
        User user3 = new User("小明3", "333");
        List<User> userList = Lists.newArrayList();
//        userList.add(user);
        userList.add(user1);
//        userList.add(user2);
        userList.add(user3);
        userDao.batchInsertUser(userList);
        System.out.println(userList);
    }
}
