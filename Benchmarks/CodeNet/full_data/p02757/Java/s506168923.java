import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] first = br.readLine().split(" ", 2);
        int n = Integer.parseInt(first[0]);
        int p = Integer.parseInt(first[1]);
        char[] arr = br.readLine().toCharArray();
        int[] prev = new int[p];
        
        long count = 0;
        for (int i = 1; i <= n; i++) {
            int[] next = new int[p];
            int x = arr[i - 1] - '0';
            for (int j = 0; j < p; j++) {
                next[(j * 10 + x) % p] += prev[j];
            }
            next[x % p]++;
            count += next[0];
            prev = next;
        }
        System.out.println(count);
    }
}
