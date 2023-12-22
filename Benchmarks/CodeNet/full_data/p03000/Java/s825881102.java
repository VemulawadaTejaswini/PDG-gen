import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int X = scan.nextInt();
        int[] L = new int[N];
        for (int i = 0; i < N; i++) L[i] = scan.nextInt();
        int ans = 1, count = 0;
        for (int i = 0; i < N; i++) {
            count += L[i];
            if (count <= X) ++ans;
        }
        System.out.println(ans);
    }
}