package ua.dev.poc;

import java.lang.annotation.Annotation;

public interface TestRunnable {

    void run(Class<?> klazz, Class<? extends Annotation> targetAnnotation);
}
