package com.leon.simplefactory;

import com.leon.simplefactory.impl.MailSender;
import com.leon.simplefactory.impl.SmsSender;

/**
 * Created on 2018/4/22.
 *
 * @author Xiaolei-Peng
 */
public class SendFactory {
    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }
}
