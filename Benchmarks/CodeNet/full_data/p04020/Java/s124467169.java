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
                if (left == true && x!=0) {
                    x++;
                }
                count+=x/2;
                if (x % 2 == 1) {
                    left = true;
                } else {
                    left=false;
                }
            }
            System.out.println(count);
        }
    }
}