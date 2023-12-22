import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int d = sc.nextInt();
        switch (d) {
            case 25:
                System.out.println("Christmas");
                return;
            case 24:
                System.out.println("Christmas Eve");
                return;
            case 23:
                System.out.println("Christmas Eve Eve");
                return;
            case 22:
                System.out.println("Christmas Eve Eve Eve");
                return
        } 
    }
}