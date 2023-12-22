import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        List<Integer> alist = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            alist.add(a[i]);
        }

        int[] x = new int[q];
        for (int i = 0; i < q; i++) {
            x[i] = sc.nextInt();
        }

        int takahashi = 0;


        for (int i = 0; i < q; i++) {

            while (0 < alist.size()) {
                if (a.length % 2 == 1) {
                    int max = a[0];
                    int jj = 0;
                    for (int j = 0; j < a.length; j++) {
                        if (max < a[j]) {
                            max = a[j];
                            jj = j;
                        }
                    }
                    takahashi = takahashi + max;
                    alist.remove(jj);
                } else {
                    int near = a[0];
                    int nn = 0;
                    for (int j = 1; j < a.length; j++) {
                        int no1 = Math.abs(near - x[i]);
                        int no2 = Math.abs(a[j] - x[i]);
                        if (no1 < no2) {
                            near = a[j];
                            nn = j;
                        }
                    }
                    alist.remove(nn);
                }
            }
            System.out.println(takahashi);
        }

    }
}

# メモ








