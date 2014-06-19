package ua.dev.poc;

import java.lang.annotation.Annotation;

public interface TestRunnable {

    /**
     * Run test
     * @param klazz test case class
     * @param targetAnnotation annotation on test method
     */
    void run(Class<?> klazz, Class<? extends Annotation> targetAnnotation);
}
