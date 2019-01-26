package mod2;
/*
Реализуйте метод, возвращающий true, если среди четырех его аргументов ровно два истинны (любые). Во всех остальных случаях метод должен возвращать false.

Воспользуйтесь шаблоном кода, который предлагает система. Ввод-вывод будет сделан за вас. Вам надо только проанализировать переданные в метод booleanExpression значения (a, b, c, d) и вернуть результат. Попробуйте составить формулу с использованием булевых операторов. Если не получается, вернитесь к этому заданию после просмотра степов про условные операторы и циклы.

При записи сложных выражений рекомендуется использовать скобки, чтобы не запутаться в порядке применения операторов.

В качестве примера уже указано заведомо некорректное решение задачи. Исправьте его.

Совет тем, у кого не проходит какой-то из тестов. В данной задаче возможно всего 16 комбинаций значений входных параметров. Их можно выписать на бумажку, посчитать для них правильные ответы и сравнить с тем, что выдает ваше решение. Попробуйте самостоятельно проделать это, найти ошибку и исправить решение.
Sample Input 1:

false false false false
Sample Output 1:

false
Sample Input 2:

true true true true
Sample Output 2:

false
Sample Input 3:

false false true true
Sample Output 3:

true
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TrueOrFalse {

    public static void main(String[] args) {
        Stream.of("ab", "AB", "cd", "CD").filter(s -> !Character.isLowerCase(s.charAt(0))).forEach(System.out::println);
    }

    public static boolean booleanExpression1(boolean a, boolean b, boolean c, boolean d) {
        int summArray = 0;
        boolean[] array = new boolean[4];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        array[3] = d;
        for (boolean anArray : array) {
            if (anArray) {
                summArray++;
            }
        }
        return summArray == 2;
    }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return Stream.of(a, b, c, d).filter(r -> r).count() == 2;
    }
}
