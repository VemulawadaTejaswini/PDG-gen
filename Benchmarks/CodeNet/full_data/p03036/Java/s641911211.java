import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long r = sc.nextInt();
            long d = sc.nextInt();
            long x = sc.nextInt();

            for (int i = 0; i < 10; i++) {
                x = r * x - d;
                System.out.println(x);
            }
        }
    }
}