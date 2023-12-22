import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long K = scanner.nextLong();
        
        System.out.println("2");
        
        if((K % 2) == 1) {
            long n = K ;
            long x = n / 2;
            long y = K - x + 1;
            System.out.printf("%d %d%n", x, y);
        } else if((K % 2) == 0) {
            long n = K;
            long x = n / 2;
            long y = K - x;
            System.out.printf("%d %d%n", x, y);
        } 
    }
}