import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a == 1 || b == 1) {
            if (a == 13) {
                System.out.println("Bob");
            } else if (b == 13) {
                System.out.println("Alice");
            } else if (a < b) {
                System.out.println("Bob");
            } else if (a > b) {
                System.out.println("Alice");
            } else if (a == b) {
                System.out.println("Draw");
            }
        }
    }
}
