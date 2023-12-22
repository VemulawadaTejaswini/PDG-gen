import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);

        long l = s.nextLong();
        long a = s.nextLong();
        long b = s.nextLong();
        int m = s.nextInt();

        BigInteger ba = BigInteger.valueOf(a);
        BigInteger bb = BigInteger.valueOf(b);

        StringBuilder sb = new StringBuilder();
        BigInteger prev = ba;
        for (int i = 0; i < l; i++) {
            sb.append(prev);
            prev = prev.add(bb);
        }

        BigInteger aaa = new BigInteger(sb.toString());
        System.out.println(aaa.mod(BigInteger.valueOf(m)));
    }
}
