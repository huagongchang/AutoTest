package com.course.testng;

import org.testng.annotations.Test;



public class ExpectedException {
    //测试失败
    @Test(enabled=false)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }

    //测试成功
    @Test(expectedExceptions=RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是我的异常测试");
        throw new NullPointerException();
    }
}
