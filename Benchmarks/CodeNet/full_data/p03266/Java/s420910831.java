import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        long ret = 0;

        if (K % 2 == 0) {
            ret += (N / (K / 2)) * (N / (K / 2)) * (N / K);
        } else {
            ret += (long) Math.pow(N / K, 3);
        }

        System.out.println(ret);

    }
}