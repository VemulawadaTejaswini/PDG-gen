
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        boolean[] dp = new boolean[k+1];
        for (int i = 0; i <= k; i++) {
            for (int a : arr){
                if(a<=i) {
                    if(!dp[i-a]){
                        dp[i]=true;
                    }
                }
            }
        }
        System.out.println((dp[k]?"First":"Second"));
    }
}
