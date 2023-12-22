import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] k = new int[n];
        for(int i = 0;i < n; i++){
            k[i] = sc.nextInt();
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 1; i <= 100; i++){
            int tmp = 0;
            for(int j : k){
                tmp += Math.pow(Math.abs(i-j),2);
            }
            ans = Math.min(ans,tmp);
        }
        System.out.println(ans);
    }
}