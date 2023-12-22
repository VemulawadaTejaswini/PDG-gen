import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] hl = new int[n];
        for(int i = 0; i < n; i++){
            hl[i] = sc.nextInt();
        }
        Arrays.sort(hl);
        long ans = 0;
            for(int i = 0; i < n-k; i++){
            ans += hl[i];
        }
        System.out.println(ans);
    }
}