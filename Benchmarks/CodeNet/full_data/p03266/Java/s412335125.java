import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        long k = Long.parseLong(sc.next());
        if (k % 2 != 0) {
            long temp = n / k;
            System.out.println(temp * temp * temp);
        } else {
            long temp = n / k;
            long temp2 = (n + k / 2) / k;
            System.out.println(temp * temp * temp + temp2 * temp2 * temp2);
        }
    }
}