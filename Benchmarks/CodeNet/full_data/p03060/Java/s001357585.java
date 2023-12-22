import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] v = new int[N];
        int[] c = new int[N];
        for (int i = 0; i < N; i++) {
            v[i] = scan.nextInt();
        }
        for (int i = 0; i < N; i++) {
            c[i] = scan.nextInt();
        }
        int[] d = new int[N];
        for (int i = 0; i < N; i++) {
            d[i] = v[i] - c[i];
        }
        Arrays.sort(d);
        int answer = 0;
        for (int i = 0; i < N; i++) {
            if (0 < d[i]) {
                answer += d[i];
            }
        }
        System.out.println(answer);
    }
}
