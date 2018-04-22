package com.leon.factorymethod;

import com.leon.factorymethod.factory.SendMailFactory;

/**
 * Created on 2018/4/22.
 *
 * @author Xiaolei-Peng
 *
 * 工厂方法模式
 */
public class FactoryMethodApp {
    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.send();
    }
}
