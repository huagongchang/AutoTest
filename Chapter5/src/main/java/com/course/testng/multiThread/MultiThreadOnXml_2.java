package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnXml_2 {
    @Test
    public void test1(){
        System.out.printf("222_Thread Id : %s%n",Thread.currentThread().getId());
    }

    @Test
    public void test2(){
        System.out.printf("222_Thread Id : %s%n",Thread.currentThread().getId());
    }

    @Test
    public void test3(){
        System.out.printf("222_Thread Id : %s%n",Thread.currentThread().getId());
    }
}
