package org.courses.ex5_3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        Human human = new Human("Daria", 7, 25);
        Class<? extends Human> aClass = human.getClass();
        System.out.println(aClass);

        Constructor[] constructors = aClass.getConstructors();
        for (Constructor constructor: constructors){
            System.out.println(constructor);
        }
        Method[] methods = aClass.getDeclaredMethods();
        for (Method method :methods){
            System.out.println(method);
        }
        Field [] fields = aClass.getDeclaredFields();
        for (Field field : fields){
            System.out.println(field);
        }
    }
}

