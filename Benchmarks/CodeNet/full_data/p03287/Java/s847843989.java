import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = sc.nextLong();
        long a[] = new long[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextLong();
        }
        long sum = 0;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                long z = 0;
                for(int k = i; k <= j; k++){
                    z += a[k];
                }
                if (z%m == 0) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}