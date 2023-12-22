import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a  = sc.nextLong();
        double b  = sc.nextLong();
        double c  = sc.nextLong();

        double k  = sc.nextLong();

        System.out.println((int)(k % 2 == 0 ? (a - b) : (b - a)));
    }
}