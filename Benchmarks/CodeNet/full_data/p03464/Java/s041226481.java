
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] a = new int[k];
        
        for (int i = 0; i < k; i++) {
            a[i] = sc.nextInt();
        }

        if (a[k-1] != 2) {
            System.out.println(-1);
            return;
        }
        
        int aMax = 2;
        int ansMin = 2;
        int ansMax = 3;
        
        for (int i = k-2; i >= 0; i--) {
            if (a[i] >= aMax*2) {
                System.out.println(-1);
                return;
            }
            if (aMax < a[i]) {
                aMax = a[i];
            }
            
            if (a[i] > a[i+1]) {
                ansMin = a[i];
                ansMax = a[i + 1] * 2 - 1;
            } else if (a[i] < a[i+1]) {
                ansMin = a[i+1] + a[i] - a[i+1] % a[i];
                ansMax = sub(a[i], a[i+1]);
            }
        }
        
        System.out.println(ansMin + " " + ansMax);
    }
    static int sub(int a, int b) {
        int na = 0;
        for (;;) {
            na += a;
            if (na >= b*2) {
                return na - 1;
            }
        }
    }
}