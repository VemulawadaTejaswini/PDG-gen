
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(c * 2 >= a + b) {
            System.out.println(a * x + b * y);
            return;
        }
        if(x > y) {
            if(c * 2 >  a + b) {
                System.out.println(c * y * 2 + (x - y) * a);
            }
            else {
                System.out.println(c * x * 2) ;
            }
        }
        else {
            if(c * 2 > a + b) {
                System.out.println(c * x * 2 + (y - x) * b);
            }
            else {
                System.out.println(c * y * 2) ;
            }
        }
    }
}
