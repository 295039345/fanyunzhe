package com.example.demo;

import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={DemoApplication.class})// 指定启动类
public class DemoApplicationTests {

     public static int a = 0;

    @BeforeClass
    public static void beforeClass() {
        System.out.print("测试类beforeClass");
        a += 1;
        System.out.print(a);
    }

    @AfterClass
    public static void afterClass() {
        System.out.print("测试类afterClass");
        a += 1;
        System.out.print(a);
    }

    @Before
    public void before() {
        System.out.print("测试方法before");
        a += 1;
        System.out.print(a);
    }

    @After
    public void after() {
        System.out.print("测试方法after");
        a += 1;
        System.out.print(a);
    }

    @Test
    public void tset() {
        System.out.print("springboot测试");
        a += 1;
        System.out.print(a);
    }

}
