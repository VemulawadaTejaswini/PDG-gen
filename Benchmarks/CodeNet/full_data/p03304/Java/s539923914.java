import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble(), m = sc.nextDouble(), d = sc.nextDouble();
        long nn = (long) n, dd = (long) d;
        double count = 0;
        for (long i = 1; i <= nn; i++) {
            if(i+dd <= nn) {
                count++;
            }
            if(i-dd >= 1) {
                count++;
            }
            if(d == 0) {
                count--;
            }
        }
        System.out.println((m - 1.0) / count);
    }
}
