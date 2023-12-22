import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = 0;
        int[] count = {0};
        int n9 = 0, n6 = 0;
        while(n > 18) {
            n9 = kei9(n, count);
            n6 = kei6(n, count);
            // System.out.println("n9 = " + n9);
            // System.out.println("n6 = " + n6);
            if(n9 < n6) {
                n = n9;
            }else {
                n = n6;
            }
            count[0] += 1;
            // System.out.println("n = " + n + "count = " + count[0]);
            // System.out.println("=============");
            // (kei9(n, count) < kei6(n, count))? n = kei9(n, count) : n = kei6(n, count);
        }
        if(((n / 6) + (n % 6)) < ((n / 9) + (n % 9))) {
            System.out.println(count[0] + ((n / 6) + (n % 6)));
        }else {
            System.out.println(count[0] + ((n / 9) + (n % 9)));
        }

	}

    public static int kei9(int n, int[] count) {
        for(int i = 1; i <= 100000; i++) {
            if(n < Math.pow(9, i)) {
                if(i - 1 != 0) {
                    // System.out.println("i = " + i);
                    // System.out.println("v9 = " + Math.pow(9, i - 1) + " " + (i - 1));
                    n = n - (int)Math.pow(9, i - 1);
                    // System.out.println("n9 = " + n);
                    // count[0] += 1;
                    // System.out.println("count9 = " + count[0]);
                    break;
                }else {
                    break;
                }
            }
        }
        return n;
    }
    public static int kei6(int n, int[] count) {
        for(int i = 1; i <= 100000; i++) {
            if(n < Math.pow(6, i)) {
                if(i - 1 != 0) {
                    // System.out.println("i = " + i);
                    // System.out.println("v6, i = " + Math.pow(6, i - 1) + " " + (i - 1));
                    n = n - (int)Math.pow(6, i - 1);
                    // System.out.println("n6 = " + n);
                    // count[0] += 1;
                    // System.out.println("count6 = " + count[0]);
                    break;
                }else {
                    break;
                }
            }
        }
        return n;
    }
}
