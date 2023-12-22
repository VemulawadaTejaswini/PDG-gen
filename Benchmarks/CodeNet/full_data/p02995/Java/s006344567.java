import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        方針
        A以上で割り切れる-B以上で割り切れるやつ
        CでもDでも割り切れるやつを足す
        ここでCでもDでも割り切れる数はCDの最小公倍数
         */

        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();
        long ans = 0;

        ans = f(B, C, D) - f(A - 1, C, D);

        System.out.println(ans);
    }

    static long f(long W, long C, long D) {
        long quanty = W;
        quanty -= W / C;
        quanty -= W / D;
        quanty += W / lcm(C, D);
        return quanty;
    }

    static long lcm(long C, long D) {
        return C * D / gcd(C, D);
    }

    static long gcd(long C, long D) {
        return D > 0 ? gcd(D, C % D) : C;
    }

}
