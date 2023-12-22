import java.io.*;
import java.util.*;

class Main {
	public static void main(String args[]) {
    	Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        int i = 0;
        while( i < n) {
            a[i] = s.nextInt();
            i++;
        }
        i = 0;
        int ans = 0;
        int prev = 0;
        while( i < n) {

            while(i+1 < n && a[i+1] >= a[i]) {
                i++;
            }
            ans += a[i] - prev;
            while(i+1 < n && a[i+1] < a[i]) {
                i++;
            }
            prev = a[i];
            if(i+1 == n) break;
        }
        System.out.println(ans);
    }
}