import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        if(x ==0) {
            System.out.println(0);
            return;
        }
        long a500 = x / 500;
        long b = x % (a500 * 500);
        long b5 = b / 5;
        System.out.println(a500 * 1000 + b5 * 5);
    }
}