package com.leon.simplefactory;

/**
 * Created on 2018/4/22.
 *
 * @author Xiaolei-Peng
 *
 * 静态（简单）工厂模式
 */
public class SimpleFactoryApp {
    public static void main(String[] args) {
        Sender sender = SendFactory.produceMail();
        sender.send();
    }
}
