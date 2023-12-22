import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Long.parseLong(scanner.next());
        long k = Long.parseLong(scanner.next());
        System.out.println(Math.min(n%k, Math.abs(k-n%k)));
    }
}