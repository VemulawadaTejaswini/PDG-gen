import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] f = line.split(" ");
        BigInteger k = new BigInteger(f[0]);
        BigInteger a = new BigInteger(f[1]);
        BigInteger b = new BigInteger(f[2]);
        BigInteger kp1 = k.add(BigInteger.ONE);
        if (b.compareTo(a) <= 0 || k.compareTo(a) < 0) {
            System.out.println(kp1);
            return;
        }

        BigInteger ks = k.subtract(a);
        BigInteger r = b; // a回叩いたなら一回は交換
        BigInteger d = b.subtract(a);
        // 残りが奇数回なら、先に1回叩いておく(先に増やした方が得のはず)
        if (ks.testBit(0)) {
            r = r.add(BigInteger.ONE);
        }
        ks = ks.shiftRight(1);
        // 残り回数がある間
        while (ks.compareTo(BigInteger.ZERO) > 0) {
            BigInteger na = r.divide(a);
            // 全部交換するには回数が不足
            if (na.compareTo(ks) < 0) {
                // 残り回数で処理
                r = r.add(d.multiply(ks));
                break;
            }
            r = r.add(d.multiply(na));
            ks = ks.subtract(na);
        }
        System.out.println((kp1.compareTo(r) > 0)  ? kp1 : r);
    }
}