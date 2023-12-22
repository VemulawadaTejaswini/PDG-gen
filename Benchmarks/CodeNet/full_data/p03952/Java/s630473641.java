import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();

        int[] answer = new int[2 * N - 1];
        answer[N - 1] = x;
        for (int i = 1; i < N; ++i) {
            answer[N + i - 1] = x + i;
            answer[N - i - 1] = x - i;
        }
        for (int i = 0; i < answer.length; ++i) {
            if (answer[i] < 1 || answer[i] > 2 * N - 1) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
        for (int i = 0; i < answer.length; ++i) {
            System.out.println(answer[i]);
        }
        
    }
}