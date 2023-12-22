import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        if (Math.sqrt(a) + Math.sqrt(b) < Math.sqrt(c)) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }

}
