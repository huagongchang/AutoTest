package com.course.testng.groups;

import org.testng.annotations.*;

public class GroupsOnMethod {
    @Test(groups="server")
    public void test1() {
        System.out.println("这是服务端组的测试方法1111");
    }

    @Test(groups="server")
    public void test2(){
        System.out.println("这是服务端组的测试方法2222");
    }

    @Test(groups="client")
    public void test3() {
        System.out.println("这是客户端组的测试方法3333");
    }

    @Test(groups="client")
    public void test4(){
        System.out.println("这是客户端组的测试方法4444");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("这是在测试方法运行前运行的方法");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("这是在测试方法运行后运行的方法");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("这是在类运行前运行的方法");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("这是在类运行后运行的方法");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("这是服务端组运行之前运行的方法");
    }

    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("这是服务端组运行之后运行的方法！！！！！");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("这是客户端组运行之前运行的方法");
    }

    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("这是客户端组运行之后运行的方法！！！！！");
    }
}
