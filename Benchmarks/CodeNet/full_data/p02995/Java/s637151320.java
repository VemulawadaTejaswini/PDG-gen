import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();

        long ans = f(B, C, D) - f(A - 1, C, D);
        System.out.println(ans);
    }

    //X以下でC,Dのどちらでも割り切れない整数の個数を求める
    static long f(long X, long C, long D) {
        long quanty = X;
        quanty -= X / C;
        quanty -= X / D;
        //上2行でCDどっちでも割れる数の個数を
        // 2回引いたので同じものを一回足す
        quanty += X / lcm(C, D); 
        return quanty;
    }

    static long lcm(long C, long D) {
        return C * D / gcd(C, D);
    }

    static long gcd(long C, long D) {
        return D > 0 ? gcd(D, C % D) : C;
    }

}
