import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long d = sc.nextInt();
        long e = sc.nextInt();
        long f = sc.nextInt();
        long answater = 0;
        long anssuger = 0;
        double ansper = 0;
        for (long i = 0; 100 * a * i <= f; i++) {
            for (long j = 0; 100 * a * i + 100 * b * j <= f; j++) {
                for (long k = 0; 100 * a * i + 100 * b * j + k * c <= f; k++) {
                    for (long l = 0; 100 * a * i + 100 * b * j + k * c + l * d <= f; l++) {
                        if (c * k + d * l > (a * i + b * j) * e) {
                            continue;
                        }
                        double tmp = (k * c + l * d) * 1.0 / (100 * a * i + 100 * b * j + k * c + l * d);
 
                        if (tmp > ansper) {
                            ansper = tmp;
                            answater = 100 * a * i + 100 * b * j + k * c + l * d;
                            anssuger = k * c + l * d;
                        }
                    }
                }
            }
        }
        System.out.println(answater + " " + anssuger);
    }
}