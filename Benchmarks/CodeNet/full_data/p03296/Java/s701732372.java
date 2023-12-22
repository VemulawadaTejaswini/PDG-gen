import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] color = new int[N];
        for (int i = 0; i < N; i++) {
            color[i] = scan.nextInt();
        }
        System.out.println(solve(N, color));
    }
    public static int solve(int N, int[] color) {
        int answer = 0;
        for (int i = 1; i < N; i++) {
            if (color[i-1] == color[i]) {
                answer++;
                if (i + 1 < N) {
                    color[i] = color[i+1]+1;
                }
            }
        }
        return answer;
    }
}
