import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        long C = scan.nextLong();
        long K = scan.nextLong();
        long[] l = new long[N];
        for (int i = 0; i < N; i++) {
            l[i] = scan.nextLong();
        }
        Arrays.sort(l);
        long[] r = new long[N];
        for (int i = 0; i < N; i++) {
            r[i] = l[i] + K;
        }
        int answer = 0;
        long current = l[N-1];
        long number_of_people = 1;
        for (int i = N-2; 0 <= i; i--) {
            if (current <= r[i]) {
                number_of_people += 1;
                continue;
            }
            answer += (number_of_people + (C - 1)) / C;
            number_of_people = 1;
            current = l[i];
        }
        answer += (number_of_people + (C - 1)) / C;
        System.out.println(answer);
    }
}
