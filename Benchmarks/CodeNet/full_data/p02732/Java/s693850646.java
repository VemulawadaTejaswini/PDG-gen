import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] al = new long[n];
        long[] cl = new long[n+1];
        long total = 0;
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            al[i] = a;
            cl[a]++;
        }
        for(int i = 1; i < n+1; i++){
            total += cl[i] * (cl[i]-1) / 2;
        }
        for(long a : al){
            System.out.println(total - cl[(int)a]+1);
        }
    }
}