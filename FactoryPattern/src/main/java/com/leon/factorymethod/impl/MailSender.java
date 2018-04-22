package com.leon.factorymethod.impl;


import com.leon.factorymethod.Sender;

/**
 * Created on 2018/4/22.
 *
 * @author Xiaolei-Peng
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("Send by mail");
    }
}
