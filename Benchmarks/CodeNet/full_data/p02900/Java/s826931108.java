import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        if (a == 1 || b == 1) {
            System.out.println(1);

        } else {
            long gcd = getGcd(a, b);
            int result = 1;
            if (gcd % 2 == 0){
                while(gcd % 2 == 0) {
                    gcd /= 2;
                }
                result++;
            }
            for (int i = 3; i <= gcd; i += 2) {
                if (gcd % i == 0) {
                    result++;
                    while(gcd % i == 0) {
                        gcd /= i;
                    }
                }
            }

            System.out.println(result);
        }
    }

    public static long getGcd(long a, long b) {
        long temp;
        while ((temp = a % b) != 0) {
            a = b;
            b = temp;
        }
        return b;
    }
}