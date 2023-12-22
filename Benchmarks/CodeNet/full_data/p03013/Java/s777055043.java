import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long mod = 1_000_000_007;
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] a = new int[M+2];
        for (int i=1;i<=M;i++){
            a[i] = sc.nextInt();
            if (a[i]-a[i-1]==1 && a[i]!=1){
                System.out.println(0);
                return;
            }
        }
        a[a.length-1] = N+1;
        long ans = 1;
        for (int i=1;i<=M+1;i++){
            if (a[i]==1){
                continue;
            }
            long x;
            long y = 1;
            long z = 0;
            for (int j=0;j<a[i]-a[i-1];j++){
                x = y;
                y = z;
                z = x + y;
            }
            ans = ans*z%mod;
        }
        System.out.println(ans);
    }
}