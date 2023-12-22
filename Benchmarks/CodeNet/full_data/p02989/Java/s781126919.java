import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = Integer.parseInt(sc.next());
        }

        Arrays.sort(d);

        int cnt = 0;
        if (d[n/2 - 1] == d[n/2]) {
            cnt = 0;
        } else {
            cnt = d[n/2] - d[n/2 - 1];
        }

        System.out.println(cnt);
    }
}