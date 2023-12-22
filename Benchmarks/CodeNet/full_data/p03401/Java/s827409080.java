import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n + 2];
        a[0] = 0;
        a[n + 1] = 0;
        for (int i = 1; i < n + 1; i++) {
            a[i] = in.nextInt();
        }

        int total = 0;
        for (int i = 0; i < n + 1; i++) {
            total += Math.abs(a[i + 1] - a[i]);
        }

        for (int i = 1; i < n + 1; i++) {
            int ans = 
                total - 
                Math.abs(a[i - 1] - a[i]) - 
                Math.abs(a[i] - a[i + 1]) + 
                Math.abs(a[i - 1] - a[i + 1]);
            System.out.println(ans);
        }
    }
}