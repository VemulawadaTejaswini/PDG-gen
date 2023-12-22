import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by zzt on 17-2-11.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String[] a = new String[n];
        String[] b = new String[m];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.next();
        }

        for (int i = 0; i < m; i++) {
            b[i] = scanner.next();
        }
        int[] next = new int[m + 1];
        next[0] = next[1] = 0;
        int j = 0;
        for (int i = 1; i < m; i++) {
            while (j>0&&b[i].equals(b[j]))
                j = next[j];
            if (b[i].equals(b[j]))
                j++;
            next[i+1] = j;
        }
        j=0;
        int off = -1;
        for (int i = 0; i < n; i++) {
            if (j==0)
                off = a[i].indexOf(b[j]);
            while (j>0&&off!=a[i].indexOf(b[j],off))
                j = next[j];
            if (off==a[i].indexOf(b[j],off)&&off!=-1)
                j++;
            if (j == m) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}