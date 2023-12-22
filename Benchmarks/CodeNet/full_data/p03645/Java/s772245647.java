import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] array1 = new int[m];
        int[] array2 = new int[m];
        int c1 = 0;
        int c2 = 0;
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 1) {
                array1[c1] = b;
                c1++;
            }
            if (b == n) {
                array1[c2] = b;
                c2++;
            }
        }
        int ans = 0;
        for (int i = 0; i < c1; i++) {
            for (int j = 0; j < c2; j++) {
                if (array1[i] == array2[j]) {
                    ans = 1;
                }
            }
        }
        if (ans == 1) {
            System.out.println("POSSIBLE");
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }
}
