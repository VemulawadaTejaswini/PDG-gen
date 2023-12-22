
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = in.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = in.nextInt();
        }
        int[] first = new int[n];
        int[] second = new int[n];
        long result = 0;
        for (int i = n - 2; i >= 0; i--) {
            if (p[i + 1] > p[i]) {
                first[i] = p[i + 1];
                second[i] = p[i];
            } else {
                first[i] = p[i];
                second[i] = p[i + 1];
            }
            result += second[i];
            for (int j = i - 1; j >= 0; j--) {
                if (p[j] > second[j + 1]) {
                    if (p[j] < first[j + 1]) {
                        first[j] = first[j + 1];
                        second[j] = p[j];
                    } else {
                        second[j] = first[j + 1];
                        first[j] = p[j];
                    }
                } else {
                    first[j] = first[j + 1];
                    second[j] = second[j + 1];
                }
                result += second[j];
            }
        }
        System.out.println(result);
    }
}
