import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] D = new int[N];
        for (int i = 0; i < N; i++) {
            D[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        int[] T = new int[M];
        for (int i = 0; i < M; i++) {
            T[i] = sc.nextInt();
        }
        Arrays.sort(D);
        Arrays.sort(T);
        int index = 0;
        for (int i : D) {
            if (index < T.length && T[index] == i) {
                index++;
            }
        }
        System.out.println(index == T.length ? "YES" : "NO");

    }
}