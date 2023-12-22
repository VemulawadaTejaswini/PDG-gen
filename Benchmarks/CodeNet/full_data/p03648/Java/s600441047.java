import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long K = scanner.nextLong();
        
        System.out.println("5");
        
        //0 1 2 3 4
        long n = K / 5;
        
        //int m = K % 5;
        
        //n   n+1 n+2 n+3 n+4   m=0
        //n+5 n   n+1 n+2 n+3   m=1
        //n+4 n+5 n   n+1 n+2   m=2
        //n+3 n+4 n+5 n   n+1   m=3
        //n+2 n+3 n+4 n+5 n     m=4
        
        System.out.printf("%d %d %d %d %d%n", n, n+1, n+2, n+3, n+4);
        
    }
}