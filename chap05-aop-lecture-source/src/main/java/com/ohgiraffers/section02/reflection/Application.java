package com.ohgiraffers.section02.reflection;

import java.lang.reflect.*;

public class Application {
    public static void main(String[] args) {

        /* 필기.
        *   리플렉션(reflection)이란?
        *    컴파일 된 자바 코드에서 역으로 클래스를 불러 메소드 및 필드 정보를 구해오는 방법이다.
        *    스프링 프레임워크, 마이바티스, 하이버네이트, jackson 등의 라이브러리에서 사용된다
        *    스프링에서는 런탐임 시 개발자가 등록한 빈을 애플리케이션 내에서 사용할 수 있게 하는 기술이기도 하다.
        *
        *   필기.
        *    reflection은 강력한 도구이지만 무분별하게 사용해서는 안된다.
        *    1. 오버헤드 발생: 성능 저하를 발생할 수 있기 때문에 민감한 어플리케이셔에서는 사용되지 않는다.
        *    2. 캡슐화 저해: private로 설정한 member(또는 필드)에 접근 가능하기 때문에 코드 기능이 저하되며
        *                  여러가지 문제를 야기할 수 있다.
        * */


        /* 설명. 1. Class 타입의 Class 메타 정보 추출 */
        Class class1 = Account.class;
        System.out.println("class1 = " + class1);

        Class class2 = new Account().getClass();
        System.out.println("class2 = " + class2);

        try {
            Class class3 = Class.forName("com.ohgiraffers.section02.reflection.Account");
            System.out.println("class3 = " + class3);

            Class class4 = Class.forName("[D");

            Class class5 = double[].class;

            System.out.println("class4 = " + class4);
            System.out.println("class5 = " + class5);

            Class class6 = Class.forName("[Ljava.lang.String;");
            Class class7 = String[].class;
            System.out.println("class6 = " + class6);
            System.out.println("class7 = " + class7);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        /* 필기. reflection을 사용하면 private도 무시 가능 */
        /* 설명. 2. 필드 정보 추출 */
        Field[] fields = Account.class.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("modifiers: " + Modifier.toString(field.getModifiers())
                    + ", type: " + field.getType()
                    + ", name: " + field.getName()
            );
        }

        /* 설명. 3. 생성자 정보 추출 */
        Constructor[] constructors = Account.class.getConstructors();   // 생성자들이 배열로 담김
        for (Constructor constructor : constructors) {
            System.out.println("name: " + constructor.getName());

            Class[] params = constructor.getParameterTypes();
            for (Class param : params) {
                System.out.println("paramType: " + param.getTypeName());
            }
        }

        try {
            /* 필기. 우리가 선언한 순서와 반대로 배열에 추가됨 */
            Account acc = (Account) constructors[0].newInstance("20", "110-223-123456", "1234", 10000);
            System.out.println(acc.getBalance());
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }

        /* 설명. 4. 메소드 정보 추출 */
        Method[] methods = Account.class.getMethods();
        Method getBalaceMethod = null;
        for (Method method : methods) {
            System.out.println(Modifier.toString(method.getModifiers()) + " "
                    + method.getReturnType().getSimpleName() + " "
                    + method.getName()
            );

            if("getBalance".equals(method.getName())){
                getBalaceMethod = method;
            }
        }

        /* 필기. 면접 준비 요소 1 */
        try {
            System.out.println(getBalaceMethod.invoke(((Account)constructors[2].newInstance())));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        }
    }
}
