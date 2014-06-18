package ua.dev.poc.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnnotationProcessor {
    private final List<Method> methods;
    private Method[] declaredMethods;

    public AnnotationProcessor() {
        methods = new ArrayList<Method>();
    }

    public List<Method> getAllAnnotatedMethods(final Class<?> type, final Class<? extends Annotation> annotation) {
        Class<?> klass = type;
        do {
            declaredMethods = klass.getDeclaredMethods();
            final List<Method> allMethods = new ArrayList<Method>(Arrays.asList(declaredMethods));

            for(Method method : allMethods){
                if(annotation == null || method.isAnnotationPresent(annotation)){
                    method.getAnnotation(annotation);
                    methods.add(method);
                }
            }

            klass = klass.getSuperclass();
        } while (klass != Object.class);

        return methods;
    }
}
