import java.util.*;
import java.io.*;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   
        int m = sc.nextInt();   
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = 0;
        }
        int ok = 0;
        int no = 0;
        int p;
        String s;
        for (int i = 0; i < m; i++) {
            p = sc.nextInt();
            p--;
            s = sc.next();
            if (num[p] == 0 && s.equals("AC")) {
                ok ++;
                num[p] = 1;
            } else if (num[p] == 0 && s.equals("WA")) {
                num[p]--; 
            } else if (num[p] < 0 && s.equals("AC")) {
                no += -num[p];
                ok ++;
                num[p] = 1;
            } else if (num[p] < 0 && s.equals("WA")) {
                num[p]--;
            }
        }
        System.out.println(ok + " " + no);
    }
}