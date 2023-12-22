import java.util.Scanner;

/**
 *
 * @author C0117306
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n];
        int sum_dff = 0;
        for (int i = 0; i < t.length; i++) {
            t[i] = sc.nextInt();
            sum_dff += t[i];
        }
        int m = sc.nextInt();
        int[] p = new int[m];
        int[] x = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = sc.nextInt();
            x[i] = sc.nextInt();
        }
        int esca=sum_dff;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < t.length; j++) {
                if (p[i] ==j) {
                    sum_dff+=x[i];
                    int b=t[j-1];
                    sum_dff-=b;
                }
            }
            System.out.println(sum_dff);
            sum_dff=esca;
        }
    }

}