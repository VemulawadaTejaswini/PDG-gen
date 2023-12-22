import java.util.*;
import java.lang.*;

public class Main {
    
    static int s;
    static int[] a;

    
    public static void main (String args[]) {
        int ans = 0;

        Scanner sc = new Scanner(System.in);
        s = sc.nextInt();
        a = new int[10000000];
        int i = 0;
        boolean issame = false;
        
        while(true) {
            if (i == 0) {
                a[i] = s;
            } else {
                if (a[i-1] % 2 == 0) {
                    a[i] = a[i-1] / 2;
                } else {
                    a[i] = 3 * a[i - 1] + 1;
                }
            }
            //System.out.println(a[i]);
            for (int k = 0; k < i; k++) {
                if (a[k] == a[i]) {
                    issame = true;
                    break;
                }
            }
            if (issame) {
                break;
            }
            i++;
        }

        System.out.println(i + 1);
    }

}