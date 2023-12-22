import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    static final long MOD = 1000000007;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if ((n + m) % 2 == 0){
            System.out.println((n+m)/2);
        } else {
            System.out.println("IMPOSSIBLE");
        }

    }
}
