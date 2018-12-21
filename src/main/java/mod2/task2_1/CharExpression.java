package mod2.task2_1;

/*
Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\" (обратный слэш) на расстоянии a.

В качестве примера написано заведомо неправильное выражение. Исправьте его.
 */

public class CharExpression {

    public char charExpression(int a) {

        char pivot = '\\';

        return (char) (pivot + a);
    }
}
