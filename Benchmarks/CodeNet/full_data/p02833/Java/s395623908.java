import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n % 2 != 0 || n < 10){
            System.out.println(0);
            return;
        }
        char[] chr = String.valueOf(n).toCharArray();
        long ans = 0;
        int digit = (int)(Math.log10(n))+1;
        int[] a = new int[digit];
        a[0] = 0;
        for(int i = 1; i < digit; i++){
            a[i] = a[i-1] + i;
        }
        for(int i = 0; i < digit; i++){
            int x = Character.getNumericValue(chr[i]);
            ans += a[digit-1-i] * Math.pow(9,digit-2-i) * x;
        }
        System.out.println(ans);
    }
}

