import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        sc.nextLine();

        int a[] = new int[N];
        int b[] = new int[M];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        sc.nextLine();

        for (int i = 0; i < M; i++) {
            b[i] = sc.nextInt();
        }
        Arrays.sort(b);
        sc.close();

        if (X >= Y) {
            System.out.println("War");
        } else if (a[N - 1] <= b[0] - 3) {
            System.out.println("No War");
        } else {
            System.out.println("War");
        }
    }
}
