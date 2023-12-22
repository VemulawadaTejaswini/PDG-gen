import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int[] h = new int[n];
        double[] temp = new double[n];
        double near = Math.abs(temp[0]);

        int p = 1;

        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
            temp[i] = (t - (0.006 * h[i])) - a;

            if (near >= Math.abs(temp[i])) {
                p = i + 1;
            }
        }
        System.out.println(p);
    }
}








