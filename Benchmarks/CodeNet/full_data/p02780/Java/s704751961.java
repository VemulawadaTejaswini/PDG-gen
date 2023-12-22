import java.util.*;
import java.io.*;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   
        int k = sc.nextInt();   
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        int sum;
        int max = 0;
        for (int i = 0; i < n-k+1;i++) {
            sum = 0;
            for (int j = i; j < i+k; j++) {
                sum += p[j];
            }
            if (max < sum) {
                max = sum;
            }
        }
        double res = max / 2.0 + k / 2.0;
        System.out.println(res);
    }
}