import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int X = scan.nextInt();
        int[] L = new int[N];
        for (int i = 0; i < N; i++) {
            L[i] = scan.nextInt();
        }
        int current = 0;
        int answer = 1;
        for (int i = 0; i < N; i++) {
            current = current + L[i];
            if (current <= X) {
                answer += 1;
            }
        }
        System.out.println(answer);
    }
}
