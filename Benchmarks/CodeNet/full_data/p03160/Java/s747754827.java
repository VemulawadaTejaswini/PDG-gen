

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int[] memo;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] h = new int[n];
        for(int i = 0; i < n; i++){
            h[i] = scanner.nextInt();
        }
        memo = new int[n];
        Arrays.fill(memo, -1);
        System.out.println(frog(h, n-1));
//        if(n==0){
//            System.out.println(0);
//            return;
//        }
//        int pp = 0;
//        int p = Math.abs(h[0]-h[1]);
//        for(int i = 2; i < n; i++){
//            int aux = Math.min(pp+Math.abs(h[i]-h[i-2]), p+Math.abs(h[i]-h[i-1]));
//            pp = p;
//            p = aux;
//        }
//        System.out.println(p);

    }

    public static int frog(int[] h, int n){
        if(n==0) return 0;
        if(n==1) return (int)Math.abs(h[1]-h[0]);
        if(memo[n]!=-1) return memo[n];
        memo[n] = Math.min( frog(h,n-1) + Math.abs(h[n-1]-h[n]), frog(h,n-2) + Math.abs(h[n-2]-h[n] ));
        return memo[n];
    }
}
