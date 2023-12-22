
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tlarge = sc.nextInt();

        int[] c = new int[n];
        int[] t = new int[n];

        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
            t[i] = sc.nextInt();

            if (t[i] > tlarge) {
                System.out.println("TLE");
                break;
            } else {
                Arrays.sort(c);
            }
            System.out.println(c[1]);

        }
    }
}







