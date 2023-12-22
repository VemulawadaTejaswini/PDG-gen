import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = 0;
        }
        for (int i = 1; i < N; i++) {
            int num = s.nextInt();
            A[num - 1] += 1;
        }
        for (int i = 0; i < N; i++) {
            System.out.println(A[i]);
        }
        s.close();
    }
}