import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<n; i++)
            a[i] = sc.nextInt();
        boolean[] stones = new boolean[k+1];
        for(int i = 0; i<=k; i++) {
            for(int x: a) {
                if(i>=x && !stones[i-x])
                    stones[i] = true;
            }
        }
        System.out.println(stones[k]?"First":"Second");
    }
}