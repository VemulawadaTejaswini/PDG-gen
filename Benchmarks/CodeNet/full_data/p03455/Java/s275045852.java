import java.util.Scanner;

public class Main {
    public static void ABC086() {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if ((a * b) % 2 == 0)
                System.out.println("Even");
            else
                System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        ABC086();
    }
}