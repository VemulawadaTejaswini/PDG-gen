import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        if(a.compareTo(b) > 0) System.out.println("GREATER");
        else if(a.compareTo(b) < 0) System.out.println("LESS");
        else System.out.println("EQUAL");
    }
}