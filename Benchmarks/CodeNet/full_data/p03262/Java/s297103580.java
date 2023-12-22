import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] xA = new int[n+1];
        for (int i = 0; i < n; i++) {
            xA[i] = sc.nextInt();
        }
        xA[n] = x;
        Arrays.sort(xA);

        int[] diffA = new int[n];
        for (int i = 0; i < n; i++) {
            diffA[i] = xA[i+1] - xA[i];
        }

        Arrays.sort(diffA);
        System.out.println(diffA[0]);
    }
}
