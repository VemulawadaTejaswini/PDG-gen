import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        sc.close();

        System.out.println(GoldenApple(N, D));
    }
    public static int GoldenApple(int N, int D) {
        return ((N - 1) / (2 * D + 1)) + 1;
    }
}
