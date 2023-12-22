import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] height = new int[N];
        for (int i = 0; i < N; i++) {
            height[i] = scan.nextInt();
        }
        int answer = 0;
        int max = 0;
        for (int i = 0; i < N; i++) {
            if (max <= height[i]) {
                answer += 1;
            }
            max = Math.max(max, height[i]);
        }
        System.out.println(answer);
    }
}
