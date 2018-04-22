package com.leon.simplefactory.impl;

import com.leon.simplefactory.Sender;

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
