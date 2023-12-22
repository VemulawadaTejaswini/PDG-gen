import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int abs = 100000;
        int count = 0;
        double[] e = new double[a];
        int[] d = new int[a];
        for (int i = 0; i < a; i++) {
            d[i] = sc.nextInt();
            e[i] = b - (d[i] * 0.006);
            if (Math.abs(e[i] - c) < abs) {
                abs = Math.abs((int) e[i] - c);
                count = i + 1;
            }
        }
        System.out.println(count);
    }
}
