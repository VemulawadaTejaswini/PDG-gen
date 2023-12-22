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
        Queue<Integer> q = new ArrayDeque<>();
        int sum = 0;
        for (int i = 0; i < k; i++) {
            q.add(p[i]);
            sum += p[i];
        }
        int max = sum;
        for (int i = k; i < n; i++) {
            int head = q.poll();
            q.add(p[i]);
            sum = sum - head + p[i];
            if (head < p[i]) {
                max = sum;
            }
        }
        
        double res = max / 2.0 + k / 2.0;
        System.out.println(res);
    }
}