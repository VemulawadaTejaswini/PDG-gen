import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC041A - Table Tennis Training

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();

        long x = 0;
        long y = 0;
        
        if (a > b) {
            x = a;
            y = b;
        } else {
            x = b;
            y = a;
        }

        long cnt = 0;
        if ((x - y) % 2 == 0) {
            cnt = (x - y) / 2;
        } else {
            int z = 1;
            if (n - x > y - 1) {
                cnt = y;
            } else {
                cnt = n - x + 1;
            }
        }
        
        System.out.println(cnt);
    }
}