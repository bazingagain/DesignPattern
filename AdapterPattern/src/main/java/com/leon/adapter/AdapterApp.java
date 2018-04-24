package com.leon.classadapter;

/**
 * Created on 2018/4/24.
 *
 * @author Xiaolei-Peng
 *
 * 类适配模式
 */
public class AdapterApp {
    public static void main(String[] args) {
        testClassApapter();
    }

    public static void testClassApapter() {
        Targetable target = new ClassAdapter();
        target.method1();
        target.method2();
    }
}
