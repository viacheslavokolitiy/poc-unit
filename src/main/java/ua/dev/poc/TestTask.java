package ua.dev.poc;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class TestTask {

    private Queue<Class<?>> mClassQueue;

    public TestTask(){
        mClassQueue = new ConcurrentLinkedQueue<Class<?>>();
    }

    public Queue<Class<?>> getTaskQueue(){
        return mClassQueue;
    }

    public void addTest(Class<?> testTask){
        mClassQueue.add(testTask);
    }
}
