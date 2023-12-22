import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Candles {
    static void func(int n,int k,int[] xa){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i <= n - k; i++){
            min = Math.min(min,Math.min(Math.abs(xa[i]),Math.abs(xa[i+k-1])) + xa[i+k-1] - xa[i]);
            //System.out.println(min+":xa[i+k-1]"+xa[i+k-1]+":xa[i]"+xa[i]);
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] xa = new int[n];
        for(int i = 0; i < n; i++){
            xa[i] = in.nextInt();
        }
        func(n,k,xa);
        in.close();
    }
}