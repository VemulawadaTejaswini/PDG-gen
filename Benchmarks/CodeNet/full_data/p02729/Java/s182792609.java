import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.close();

        System.out.println(EvenPairs(N, M));
    }
    public static int EvenPairs(int N, int M) {
        // N:偶数の個数、M:奇数の個数 return N+Mが偶数の通り数
        return (N * (N - 1) / 2) + (M * (M - 1) / 2);
    }
}
