package com.leon.interpreterpattern;

/**
 * Created on 2018/4/29.
 *
 * @author Xiaolei-Peng
 */
public class InterpreterPattern {
    public static void main(String[] args) {
        int result = new Minus().interpret(new Context(new Plus().interpret(new Context(9, 2)), 8));
    }
}
