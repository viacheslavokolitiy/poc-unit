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

    /**
     * Add test case to test queue
     * @param testTask test case class
     */
    public void addTest(Class<?> testTask){
        mClassQueue.add(testTask);
    }
}
