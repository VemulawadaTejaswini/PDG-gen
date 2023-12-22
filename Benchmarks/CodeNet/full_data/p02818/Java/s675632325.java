import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();

        for (int i = 0; i < k; i++) {
            if (a > 0) {
                a = a - 1;
            }
        }if( k == 0 || a == 0){
            if (b > 0) {
                b = b - 1;
            }
        }


        System.out.println(a);
        System.out.println(b);
    }
}
