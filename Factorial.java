 


import java.math.BigInteger;

public class Factorial {

    public BigInteger factorialOf(Integer value){
        BigInteger result = BigInteger.valueOf(1);
        for(int i = 1; i <= value; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
        }
    }

