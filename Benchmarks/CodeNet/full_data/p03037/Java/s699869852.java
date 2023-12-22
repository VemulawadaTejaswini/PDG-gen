import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Integer L[] = new Integer[m];
        Integer R[] = new Integer[m];
        for (int i = 0; i < m; i++) {
            L[i] = sc.nextInt();
            R[i] = sc.nextInt();
        }
        Integer K[] = new Integer[n];
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < m; i++) {
                if (L[j] <= i && R[j] >= i) {
                    K[i - 1] = 1;
                }
            }
            int kotae = 0;
            for (int h = 0; h < K.length; h++) {
                kotae += K[h];
            }
            System.out.println(kotae + "");
        }
    }
}