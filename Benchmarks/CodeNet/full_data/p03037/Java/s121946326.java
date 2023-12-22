import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] l = new int[m];
        int[] r = new int[m];
        for (int i = 0; i < m; i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }
        int max_l = l[0];
        int min_r = r[0];
        for (int i = 1; i < m; i++) {
            max_l = Math.max(max_l, l[i]);
            min_r = Math.min(min_r, r[i]);
        }
        if (min_r - max_l < 0) {
            System.out.println(0);
        } else {
            System.out.println(min_r - max_l + 1);
        }
        sc.close();
    }
}