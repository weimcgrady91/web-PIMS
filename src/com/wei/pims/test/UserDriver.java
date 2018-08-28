package com.wei.pims.test;

import com.wei.pims.bean.User;
import com.wei.pims.manager.UserManager;

public class UserDriver {
    public void testAdd() {
        User user = new User();
        user.setUserName("weiqun3");
        user.setPassword("1234");
        user.setName("魏群");
        user.setSex("男");
        user.setBirth("1986-10-08");
        user.setNation("满族");
        user.setEdu("本科");
        user.setWork("软件工程师");
        user.setPhone("18710087516");
        user.setPlace("菊园东站");
        user.setEmail("331855608@qq.com");
        UserManager userManager = new UserManager();
        userManager.add(user);
    }

    public void testModify() {
        User user = new User();
        user.setId(1);
        user.setUserName("weiqun3");
        user.setPassword("1234");
        user.setName("魏群2");
        user.setSex("女");
        user.setBirth("1986-10-08");
        user.setNation("满族");
        user.setEdu("本科");
        user.setWork("软件工程师");
        user.setPhone("18710087516");
        user.setPlace("菊园东站");
        user.setEmail("331855608@qq.com");
        UserManager userManager = new UserManager();
        userManager.modify(user);
    }

    public void testRemove() {
        User user = new User();
        user.setId(1);
        user.setUserName("weiqun3");
        user.setPassword("1234");
        user.setName("魏群2");
        user.setSex("女");
        user.setBirth("1986-10-08");
        user.setNation("满族");
        user.setEdu("本科");
        user.setWork("软件工程师");
        user.setPhone("18710087516");
        user.setPlace("菊园东站");
        user.setEmail("331855608@qq.com");
        UserManager userManager = new UserManager();
        userManager.remove(user);
    }
    public void testQuery() {
        User user = new User();
        user.setId(5);
        UserManager userManager = new UserManager();
        user  = userManager.query(user);
        System.out.println(user.toString());
    }
    public static void main(String[] args) {
        UserDriver userDriver = new UserDriver();
//        userDriver.testAdd();
//        userDriver.testModify();
//        userDriver.testRemove();
        userDriver.testQuery();

    }
}
