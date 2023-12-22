import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        if (a % 2 == b % 2)
            System.out.println((a + b) / 2);
        else
            System.out.println("IMPOSSIBLE");
    }
}