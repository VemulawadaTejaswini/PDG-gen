import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long K = scanner.nextLong();
        
        System.out.println("2");
        
        if((K % 3) == 1) {
            int n = K ;
            int x = n / 2;
            int y = K - x + 1;
            System.out.printf("%d %d%n", x, y);
        } else if((K % 3) == 2) {
            int n = K + 1;
            int x = n / 2;
            int y = K - x;
            System.out.printf("%d %d%n", x, y);
        } else if((K % 3) == 0) {
            int n = K;
            int x = n / 2;
            int y = K - x;
            System.out.printf("%d %d%n", x, y);
        }
    }
}