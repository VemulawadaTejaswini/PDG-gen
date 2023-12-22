import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        int[] L = new int[N];
        for (int i = 0; i < N; i++) {
            L[i] = sc.nextInt();
        }

        int sum = 0;
        int i = 0;
        for (; i < N; i++) {
            sum += L[i];
            if (sum > X) {
                break;
            }
        }

        System.out.println(i + 1);
    }
}