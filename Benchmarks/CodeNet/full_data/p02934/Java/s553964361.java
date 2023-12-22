import java.util.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
        BigInteger sum =  BigInteger.valueOf(0);
        BigInteger bi = BigInteger.valueOf(1);
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
          int value = sc.nextInt();
          list[i] = value;
          bi = bi.multiply(BigInteger.valueOf(value));
        }
        for (int i = 0; i < n; i++) {
          BigInteger bi2 = BigInteger.valueOf(1);
          for (int count = 0; count < n; count++) {
            if (i != count) {
              bi2 = bi2.multiply(BigInteger.valueOf(list[count]));
            }
          }
          sum = sum.add(bi2);
        }
        BigInteger[] ans = bi.divideAndRemainder(sum);
        double seisu = ans[0].doubleValue();
        double amari = ans[1].doubleValue();
        double bunbo = sum.doubleValue();
        double shousu = amari / bunbo;
        
        System.out.println(seisu + shousu);
	}
}