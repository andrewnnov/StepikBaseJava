package mod2.task2_1;

import java.math.BigInteger;

public class DefineFactorial {

    public BigInteger factorial(int value) {

        BigInteger result = new BigInteger("1");

        for (int i = 1; i <= value ; i++) {

            result = BigInteger.valueOf(i).multiply(result);
        }

        return result;
    }

//    public BigInteger factorialRec(int value) {
//
//        return value == 0 ? 1 : value*factorialRec(value - 1) ;
//    }
}
