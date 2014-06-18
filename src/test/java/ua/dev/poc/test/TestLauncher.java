package ua.dev.poc.test;

import ua.dev.poc.annotations.TestMethod;

import java.util.Queue;
import ua.dev.poc.*;

public class TestLauncher {

    public static void main(String[] args) {
        TestTask task = new TestTask();
        task.addTest(SimpleTest.class);
        Queue<Class<?>> classes = task.getTaskQueue();


        for (Class<?> c : classes) {
            TestRunner testRunner = new TestRunner();
            testRunner.run(c, TestMethod.class);
            classes.poll();
        }
    }
}
