import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int[] s =new int[n];
            for (int j = 0; j < n; j++) {
                s[j] = i == j ? Integer.MAX_VALUE : x[j];
            }
            Arrays.sort(s);
            System.out.println(s[n/2 - 1]);
        }
    }
}
