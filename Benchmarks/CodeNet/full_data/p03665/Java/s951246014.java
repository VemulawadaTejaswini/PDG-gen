import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
    public static BigInteger[][] memo = new BigInteger[3000][3000];

    public static BigInteger choose(BigInteger n, BigInteger k) {

        if (n.intValue() == 0 && k.intValue() > 0) {
            return BigInteger.ZERO;
        } else if (k.intValue() == 0 && n.intValue() >= 0) {
            return BigInteger.ONE;
        } else if (memo[n.intValue()][k.intValue()] != null) {
            return memo[n.intValue()][k.intValue()];
        } else {
            memo[n.intValue()][k.intValue()] = choose(n.subtract(BigInteger.ONE), k.subtract(BigInteger.ONE)).add(choose(n.subtract(BigInteger.ONE), k));
        }
        return memo[n.intValue()][k.intValue()];

    }



    public static void main(String[] args) throws NumberFormatException, IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String[] line = reader.readLine().split(" ");
       int n = Integer.parseInt(line[0]);
       int p = Integer.parseInt(line[1]);
       line = reader.readLine().split(" ");
       int[] arr = new int[line.length];
       int par = 0, nepar = 0;
       for (int i = 0; i < arr.length; ++i) {
           arr[i] = Integer.parseInt(line[i]);
           if (arr[i]%2 == 0) {
               par++;
           } else {
               nepar++;
           }
       }
        BigInteger N = BigInteger.valueOf(nepar);
       if (p == 0) {
            BigInteger res = BigInteger.valueOf(2L).pow(par);
            BigInteger count = BigInteger.ZERO;
            for (int i = 0; i <= nepar; i+=2) {
                count = count.add(choose(N, BigInteger.valueOf(i)));
            }
           System.out.println(res.multiply(count));
       } else {
           BigInteger res = BigInteger.valueOf(2L).pow(par);
           BigInteger count = BigInteger.ZERO;
           for (int i = 1; i <= nepar; i+=2) {
               count = count.add(choose(N, BigInteger.valueOf(i)));
           }
           System.out.println(res.multiply(count));
       }

    }

}
