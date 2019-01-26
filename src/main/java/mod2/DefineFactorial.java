package mod2;

import java.math.BigInteger;

public class DefineFactorial {

    public BigInteger factorial(int value) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= value ; i++) {
            result = BigInteger.valueOf(i).multiply(result);
        }
        return result;
    }
}
