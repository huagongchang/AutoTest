package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

@Test(groups="stu")
public class GroupsOnClass2 {
    public void stu1(){
        System.out.println("GroupsOnClass222中的stu1111运行");
    }

    public void stu2(){
        System.out.println("GroupsOnClass222中的stu2222运行");
    }

    /*@BeforeGroups("stu")
    public void beforeGroups(){
        System.out.println("beforeGroups");
    }

    @AfterGroups("stu")
    public void afterGroups(){
        System.out.println("afterGroups");
    }*/
}
