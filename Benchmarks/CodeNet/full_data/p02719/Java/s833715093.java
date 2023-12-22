import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();
        if(k==0){
            System.out.println(n);
            return;
        }
        n = n%k;
        System.out.println(Math.min(n,k-n));
    }
}
