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

        int start = l[0];
        int end = r[0];
        for (int i = 1; i < m; i++) {
            if (l[i] > start) {
                start = l[i];
            }
            if (r[i] < end) {
                end = r[i];
            }
        }
        System.out.println(Math.max(0, end - start + 1));
    }

}
