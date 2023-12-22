import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();
        a -= k;
        if(a < 0) {
            b += a;
            a = 0;
        }
        if(b < 0) {
            b = 0;
        }
        System.out.println(a + " " + b);
    }
}