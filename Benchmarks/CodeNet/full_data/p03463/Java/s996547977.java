import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a%2 == 0 && b%2 == 0) {
            System.out.println("Alice");
        } else if(a%2 != 0 && b%2 != 0) {
            System.out.println("Alice");
        } else if(a%2 == 0 && b%2 != 0) {
            System.out.println("Borys");
        } else if(a%2 != 0 && b%2 == 0) {
            System.out.println("Borys");
        } else {
            System.out.println("Draw");
        }
    }
}
