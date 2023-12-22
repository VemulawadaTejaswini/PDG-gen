import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        long L = Long.parseLong(input[0]);
        long A = Long.parseLong(input[1]);
        long B = Long.parseLong(input[2]);
        int M = Integer.parseInt(input[3]);

        String[] sa = new String[(int)L];
        for (int i = 0; i < L; i++) {
            sa[i] = String.valueOf(A + B * i);
        }

        System.out.println(
                new BigInteger(
                        Stream.of(sa)
                                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                                .toString()
                ).mod(new BigInteger(String.valueOf(M))));
    }
}