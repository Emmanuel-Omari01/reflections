package org.example;

import org.example.annotations.LogExecutionTime;

import java.lang.reflect.Method;

/**
 * Main
 * The Java Reflection is a mechanism that allows to inspect and interact
 * with components of the Java class at runtime. It provides a way to
 * examine or modify the runtime behavior of the applications.
 */
public class Main {
    public static void main(String[] args) throws Throwable {
        //Method Reflection
//        Class<?> clazz = ClassA.class;
//        for (Method method : clazz.getDeclaredMethods()) {
//            System.out.println(method.getName());
//        }
//
//        if (clazz.isAnnotationPresent(LogExecutionTime.class)) {
//            System.out.println("ClassA is annotated with LogExecutionTime");
//        }

        ClassA classA = new ClassA();

        for (Method method : classA.getClass()
                .getDeclaredMethods()) {
            System.out.println(method.getName());

            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                System.out.println("Method: " + method.getName() + " is annotated with LogExecutionTime");
                ExecutionTimeLogger.logExecutionTimeInvocation(classA, method, null);
            }
        }
    }
}