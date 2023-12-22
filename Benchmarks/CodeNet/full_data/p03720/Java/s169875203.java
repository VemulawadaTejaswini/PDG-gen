import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] ans = new int[n];
        for(int i = 0; i < m; i++){
            int b1 = sc.nextInt()-1;
            int b2 = sc.nextInt()-1;
            ans[b1]++;
            ans[b2]++;
        }
        for(int a : ans){
            System.out.println(a);
        }
    }
}