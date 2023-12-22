import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p[] = new int[n];
        int max = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
            if (p[i] > max) {
                max = p[i];
            }
            sum += p[i];
        }
        int gen = max / 2;
        sum -= gen;
        System.out.println(sum);
    }
}