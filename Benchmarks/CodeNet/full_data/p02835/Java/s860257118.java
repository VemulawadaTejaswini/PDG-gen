import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int val1 = sc.nextInt();
            int val2 = sc.nextInt();
            int val3 = sc.nextInt();
            int result = val1 + val2 + val3;
            if (result >= 22) {
                System.out.println("bust");
            } else {
                System.out.println("win");
            }
        }
    }

}
