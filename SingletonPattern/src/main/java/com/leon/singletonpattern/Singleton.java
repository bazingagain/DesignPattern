package com.leon.singletonpattern;

/**
 * Created on 2018/4/22.
 *
 * @author Xiaolei-Peng
 */
public class Singleton {
    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonFactory.instance;
    }

    public Object readResolve() {
        return getInstance();
    }

    private static class SingletonFactory {
        private static Singleton instance = new Singleton();
    }
}
