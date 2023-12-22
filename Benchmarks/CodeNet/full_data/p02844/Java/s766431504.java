import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        char[] c = sc.next().toCharArray();
        for (int i = 0; i < n; i++) {
            a[i] = c[i] - '0';
        }
        int res = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                A:
                for (int k = 0; k < 10; k++) {
                    int pos = 0;
                    while (a[pos] != i) {
                        pos++;
                        if (pos == n)
                            continue A;
                    }
                    pos++;
                    if (pos == n)
                        continue A;
                    while (a[pos] != j) {
                        pos++;
                        if (pos == n)
                            continue A;
                    }
                    pos++;
                    if (pos == n)
                        continue A;
                    while (a[pos] != k) {
                        pos++;
                        if (pos == n)
                            continue A;
                    }
                    if (a[pos] == k)
                        res++;
                }
            }
        }

        System.out.println(res);
    }
}
