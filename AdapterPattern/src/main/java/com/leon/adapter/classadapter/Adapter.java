package com.leon.classadapter;

/**
 * Created on 2018/4/24.
 *
 * @author Xiaolei-Peng
 */
public class ClassAdapter extends Source implements Targetable {

    @Override
    public void method2() {
        System.out.println("targetable method");
    }
}
