import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();
        if (k < a) {
            a -= k;
        } else if (k >= a) {
            a = 0;
            if (b - k + a >= 0) {
                b -= k - a; 
            } else {
                b = 0;
            }
        }
        System.out.println(a + " " + b);
        sc.close();
    }
}