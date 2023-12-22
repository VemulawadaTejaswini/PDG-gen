import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] d = new Integer[n];
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }

        Arrays.sort(d);
        int start = d[d.length / 2 - 1];
        int end = d[d.length / 2];
        int result = 0;
        if (start != end) {
            result = end - start;
        }

        System.out.println(result);
    }
}
