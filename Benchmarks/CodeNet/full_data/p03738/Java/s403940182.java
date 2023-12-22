import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String A = scan.next();
        String B = scan.next();
        BigInteger a = new BigInteger(A);
        BigInteger b = new BigInteger(B);
        String answer = "";
        int compare = a.compareTo(b);
        if (compare == 0) {
            answer = "EQUAL";
        } else if (compare < 1) {
            answer = "LESS";
        } else {
            answer = "GREATER";
        }
        System.out.println(answer);
    }
}
