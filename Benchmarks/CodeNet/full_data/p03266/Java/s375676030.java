import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int K = sc.nextInt();


        int count = 0;
        for (int a = 1; a < N + 1; a++) {
            int modA = (a % K);  // aの余り
            int modB = K - modA; // a + bはKで割り切れる必要があるので bの余りはK-aの余り
            int modC = K - modA; // b + cはKで割り切れる必要があるので cの余りはK-bの余り

            if ((modB + modC) % K == 0) {
                // N以下でKで割るとmodBになるBの個数 x N以下でKで割るとmodCになるCの個数
                int b = ((N + K - modB) / K);
                int c = ((N + K - modC) / K);
                b = (modB == 0) ? b - 1 : b;
                c = (modC == 0) ? c - 1 : c;
                int num = b * c;
                count += num;
            }
        }
        System.out.println(count);
    }
}
