import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = (int) Math.sqrt(n);
        long x = 0;
        long y = 0;
        for (long i = a;i > 0;i--){
            if (n % i == 0){
              x = n / i;
              y = i;
              break;
            }
        }
        System.out.println(x + y - 2);
    }
}
