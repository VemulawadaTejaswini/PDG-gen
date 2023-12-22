import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt()-1;
        int y = sc.nextInt()-1;
        int[] ans = new int[n+1];
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int tmp = Math.min(j-i, Math.abs(i-x)+Math.abs(j-y)+1);
                ans[tmp]++;
            }
        }
        for(int i = 1; i < n; i++){
            System.out.println(ans[i]);
        }
    }
}