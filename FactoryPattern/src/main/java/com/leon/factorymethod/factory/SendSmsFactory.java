package com.leon.factorymethod.factory;

import com.leon.factorymethod.Provider;
import com.leon.factorymethod.Sender;
import com.leon.factorymethod.impl.SmsSender;

/**
 * Created on 2018/4/22.
 *
 * @author Xiaolei-Peng
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
