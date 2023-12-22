import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC148C - Snack

        Scanner sc = new Scanner(System.in);

        long a = (long)sc.nextInt();
        long b = (long)sc.nextInt();

        long x = a * b;
        
        long tmp = 0;
        if (a < b) {
            tmp = a;
            a = b;
            b = tmp;
        }
            
        long r = a % b;
        while(r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        
        System.out.println(x / b);
    }
}