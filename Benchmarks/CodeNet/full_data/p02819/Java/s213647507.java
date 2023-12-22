import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = x ; i <= 100009 ; i++) {
            if(isPrime(i)) {
                System.out.println(i);
                return;
            }
        }
    }

    static boolean isPrime(int n) {
        for (int i = 2 ; i <= Math.sqrt(n) ; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}