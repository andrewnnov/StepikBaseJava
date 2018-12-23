package mod2.task2_1;

/*
Реализуйте метод, проверяющий, является ли заданное число по абсолютной величине степенью двойки.

Решать можно разными способами:

воспользовавшись одним удобным статическим методом из класса java.lang.Integer;
применив пару трюков из двоичной арифметики;
написав решение "в лоб" с циклом и условными операторами (можете вернуться к этой задаче после просмотра соответствующих уроков).
Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
 */

import static java.lang.Math.log;

public class NumberIsPow2 {

    public boolean isPowerOfTwo(int value) {

        if(value == 0) {
            return false;
        } else {
            int newValue = Math.abs(value);
            return ((newValue) & (newValue -1))== 0;
        }
    }
}



