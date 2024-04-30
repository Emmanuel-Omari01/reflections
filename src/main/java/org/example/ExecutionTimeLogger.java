package org.example;

import java.lang.reflect.Method;

public class ExecutionTimeLogger {
    public static void logExecutionTime(Object target, Method method, long executionTime) {
        System.out.println("Method " + method.getName() + " in class " + target.getClass().getSimpleName() +
                " took " + executionTime + " milliseconds to execute.");
    }

    public static Object logExecutionTimeInvocation(Object target, Method method, Object[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = method.invoke(target, args);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        logExecutionTime(target, method, executionTime);
        return result;
    }
}
