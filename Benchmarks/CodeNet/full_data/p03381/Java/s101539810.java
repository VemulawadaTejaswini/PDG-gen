import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] x = new int[n], s = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = s[i] = in.nextInt();
        }
        Arrays.sort(s);
        int c1 = s[n/2];
        int c2 = s[n/2 - 1];
        for (int i = 0; i < n; i++) {
            System.out.println(x[i] == c1 ? c2 : c1);
        }
    }
}
