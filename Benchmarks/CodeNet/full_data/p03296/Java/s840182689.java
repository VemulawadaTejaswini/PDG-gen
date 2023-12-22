import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] a = new int[N];
        for(int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0; i < N; i++) {
            if(i != N-1) {
                if(a[i+1] == a[i] && a[i+1] != -1 && a[i] != -1) {
                    a[i+1] = -1;
                    count++;
                    continue;
                }
            } 
            if(i != 0) {
                if(a[i-1] == a[i] && a[i-1] != -1 && a[i] != -1) {
                    a[i] = -1;
                    count++;
                    continue;
                }
            }
        }
        System.out.println(count);
    }
}