package mod3;

import java.util.function.DoubleUnaryOperator;

public class SquareLeftRectangle {

    public static void main(String[] args) {
        System.out.println(integrate(x -> 1, 0, 10));
    }

    public static double integrate(DoubleUnaryOperator f, double a, double b) {

        int n = 1000;
        double result;
        result = 0;
        double h = (b - a) / n; //Шаг сетки
        for(int i = 0; i < n; i++) {
            result += f.applyAsDouble(a + h * (i + 0.5)); //Вычисляем в средней точке и добавляем в сумму
        }
        result *= h;
        return result;
    }
}
