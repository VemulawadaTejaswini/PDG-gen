import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long min = 100000000000000l;
        for (int i = 1 ; i <= Math.sqrt(n) ; i ++) {
            if (n % i == 0) {
                min = Math.min(min, (long) (i - 1) + (n / i - 1));
            }
        }

        System.out.println(min);
    }

}
