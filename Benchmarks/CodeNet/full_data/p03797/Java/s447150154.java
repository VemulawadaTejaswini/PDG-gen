import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long m = scanner.nextInt();
        System.out.println((Math.min(n,m/2))+((m-2*Math.min(n,m/2))/4));
    }
}
