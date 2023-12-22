import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();

        int a[] = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }

        int lastI = 0;
        for (int i = 0; a[i] < x; i++) {
            lastI = i;
        }
        int totalL = lastI;
        System.out.println(Math.min(totalL, m - totalL));
    }
}
