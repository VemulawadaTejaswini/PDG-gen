import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String line = input.readLine();
        BigInteger A = new BigInteger(line);
        line = input.readLine();
        BigInteger B = new BigInteger(line);

        if (A.compareTo(B)==1) {
            System.out.println("GREATER");
        } else if (A.compareTo(B)==-1) {
            System.out.println("LESS");
        } else {
            System.out.println("EQUAL");
        }
    }
}
