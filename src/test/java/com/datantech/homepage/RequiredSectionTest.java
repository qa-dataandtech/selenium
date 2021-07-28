package com.datantech.homepage;

import org.testng.annotations.Test;

public class RequiredSectionTest {
    @Test
    public void test1() {
        System.out.println("RequiredSection test 1");
    }

    @Test(groups = "regression")
    public void test2() {
        System.out.println("RequiredSection test 2");
    }
}
