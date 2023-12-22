import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n;
    static int m;
    static int[]a;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        a = new int[n];
        Arrays.fill(a, -1);

        boolean bl = true;
        for (int i = 0; i < m; i++) {
            int k = sc.nextInt()-1;
            int num = sc.nextInt();
            if (a[k] == -1) {
                a[k] = num;
            } else {
                if (a[k] != num) {
                    bl = false;
                    break;
                }
            }
        }
        if (a[0] == -1 || a[0] == 0) bl = false;
        if (bl) {
             for (int num : a) {
                 if (num == -1) {
                     System.out.print(0);
                 } else {
                     System.out.print(num);
                 }
             }
            System.out.println();
        } else {
            System.out.println(-1);
        }


    }

}