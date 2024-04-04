package org.example;

import java.lang.reflect.Method;

/**
 * Main
 * The Java Reflection is a mechanism that allows to inspect and interact
 * with components of the Java class at runtime. It provides a way to
 * examine or modify the runtime behavior of the applications.
 */
public class Main {
    public static void main(String[] args) {
        //Method Reflection
        Class<?> clazz = ClassA.class;
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println(method.getName());
        }
    }
}