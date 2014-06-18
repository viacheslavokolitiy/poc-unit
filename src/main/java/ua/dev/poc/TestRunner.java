package ua.dev.poc;

import ua.dev.poc.annotations.AnnotationProcessor;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class TestRunner implements TestRunnable {
    private AnnotationProcessor mAnnotationProcessor;

    public TestRunner(){
        mAnnotationProcessor = new AnnotationProcessor();
    }

    @Override
    public synchronized void run(Class<?> klazz, Class<? extends Annotation> targetAnnotation) {
        try {

            Class<?> c = Class.forName(klazz.getName());
            Object target = c.newInstance();
            List<Method> methodList = mAnnotationProcessor.getAllAnnotatedMethods(c, targetAnnotation);

            for(Method method : methodList){
                String methodName = method.getName();
                if(methodName.startsWith("test") && method.getGenericReturnType().equals(Void.class)){
                    continue;
                }

                System.out.format("invoking %s()%n", methodName);

                method.setAccessible(true);
                try {
                    method.invoke(target);
                } catch (InvocationTargetException e) {
                    Throwable cause = e.getCause();
                    System.err.format("invocation of %s failed: %s%n",
                            methodName, cause.getMessage());
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
