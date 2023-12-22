import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextInt();
        }
        int answer = solve(N, a);
        System.out.println(answer);
    }
    private static int solve(int N, int[] a) {
        int answer = 0;
        for (int i = 0; i < N; i++) {
            answer += (a[i] - 1);
        }
        return answer;
    }
}
