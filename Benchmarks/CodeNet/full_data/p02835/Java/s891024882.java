import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int value = a + b + c;
        if (value >= 22) {
            System.out.println("bust");
        } else {
            System.out.println("win");
        }
    }
}
