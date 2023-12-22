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
        Arrays.sort(x);
        int a = x[n-1];
        x[n-1] = -1;
        Arrays.sort(x);
        int b = -1, c = -1;
        for (int i = 0; i < n; i++) {
            if(x[i] <= a / 2) {
                b = x[i];
            } else {
                c = x[i];
                break;
            }
        }
        System.out.println(a + " " + (a/2 - b <= c - a/2 ? b : c));
    }
}
