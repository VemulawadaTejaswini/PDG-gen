import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            long i = sc.nextLong();
            long count = 0;
            boolean left = false;
            while (i-- > 0) {
                long x = sc.nextLong();
                count += x / 2;
                if (left == true && x % 2 == 1) {
                    count++;
                    left = false;
                }else if (left == true && x % 2 == 0) {
                    left = false;
                } else if ( x % 2 == 1) {
                    left = true;
                }
            }
            System.out.println(count);
        }
    }
}