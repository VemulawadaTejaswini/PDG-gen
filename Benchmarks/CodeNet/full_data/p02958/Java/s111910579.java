import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int[] p = new int[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (sc.nextInt() != i + 1) {
                cnt++;
            }
            if (cnt > 2) {
                break;
            }
        }
        if (cnt > 2) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }

    }
}