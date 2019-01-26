package mod4;

/*
Реализуйте метод, позволяющий другим методам узнать, откуда их вызвали.

Метод getCallerClassAndMethodName() должен возвращать имя класса и метода, откуда вызван метод, вызвавший данный
утилитный метод. Или null (нулевую ссылку, а не строку "null"), если метод, вызвавший getCallerClassAndMethodName()
является точкой входа в программу, т.е. его никто не вызывал.

Это актуально, например, в библиотеках логирования, где для каждого сообщения в логе надо выводить класс и метод,
откуда сообщение было залогировано.

Пример

package org.stepic.java.example;

public class Test {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        // ...
    }
}
При запуске эта программа должна вывести:
null
org.stepic.java.example.Test#main
P.S. При тестировании этой программы в среде разработки вы можете получить другой результат: вместо null в первой
строчке будет напечатан какой-то посторонний класс и метод. Это связано с тем, что среда разработки обычно запускает
не ваш класс, а свой собственный, который затем уже вызывает ваш. Чтобы этого избежать, запускайте программу командой
"java" в командной строке.

P.P.S. Эта задача в уроке про исключения не случайно :)
 */

import java.util.Arrays;

public class MyException_01 {

    public static String getCallerClassAndMethodName() {
         Throwable t = new Throwable();
         StackTraceElement[] ste = t.getStackTrace();

    if (ste.length < 3 ) {
            return null;
    } else {
            return ste[2].getClassName()+"#"+ste[2].getMethodName();
       }
    }

    public static void main(String[] args) {
        System.err.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.err.println(getCallerClassAndMethodName());
        anotherMethod1();
    }

    private static void anotherMethod1() {
        System.err.println(getCallerClassAndMethodName());
        anotherMethod2();
    }

    private static void anotherMethod2() {
        System.err.println(getCallerClassAndMethodName());
    }

}
