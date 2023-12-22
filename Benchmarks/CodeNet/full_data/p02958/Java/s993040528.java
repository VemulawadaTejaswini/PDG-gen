import java.util.*;
import java.math.*;
import java.io.*;


public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        int n = sc.nextInt();
        int[] p = new int[n];
        for(int i = 0; i < n; i++) p[i] = sc.nextInt();
        boolean ans = false;
        boolean ok = true;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                int tmp = p[i];
                p[i] = p[j];
                p[j] = tmp;
                ok = true;


                for(int k = 0; k < n - 1; k++) {
                    if(p[k] >= p[k + 1]) {
                        ok = false;
                        break;
                    }
                }
                ans |= ok;
                p[j] = p[i];
                p[i] = tmp;
            }
        }

        System.out.println(ans?"YES":"NO");

    } 
}