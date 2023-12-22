import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        sc.close();

        System.out.println(BiteEating(N, L, 1));
    }
    public static int BiteEating(int N, int L, int index) {
        int min = L;
        int max = N + L - 1;
        if (min <= 0 && 0 <= max) {
            return N * (L + N + L - 1) / 2;
        } else if (min < 0) {
            return (N - 1) * (L + (N + L - 2)) / 2;
        } else {
            return (N - 1) * ((L + 1) + (N + L - 1)) / 2;
        }
    }
}
