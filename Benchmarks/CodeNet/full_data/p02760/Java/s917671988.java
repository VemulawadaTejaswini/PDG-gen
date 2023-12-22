import java.math.*;
import java.util.*;

public class Main {
    static boolean x(int a[][]) {
        boolean tmp = false;
        for (int i = 0; i < 3; i++) {
            if (a[i][0] == a[i][1] && a[i][1] == a[i][2])
                tmp = true;
            break;
        }
        return tmp;
    }

    static boolean y(int a[][]) {
        boolean tmp = false;
        for (int i = 0; i < 3; i++) {
            if (a[0][i] == a[1][i] && a[1][i] == a[2][i])
                tmp = true;
            break;
        }
        return tmp;
    }

    static boolean c(int a[][]) {
        boolean tmp = false;
        if (a[0][0] == a[1][1] && a[1][1] == a[2][2])
            tmp = true;
        else if (a[0][2] == a[1][1] && a[1][1] == a[2][0])
            tmp = true;
        return tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int n = sc.nextInt();
        int tmp = 0;
        for (int i = 0; i < n; i++) {
            tmp = sc.nextInt();
            for (int k = 0; k < 3; k++) {
                for (int j = 0; j < 3; j++) {
                    if (a[k][j] == tmp)
                        a[k][j] = 0;
                }
            }
        }
        boolean xa = x(a);
        boolean ya = y(a);
        boolean ca = c(a);
        String ans = "No";
        if (xa || ya || ca)
            ans = "Yes";
        System.out.println(ans);
    }
}