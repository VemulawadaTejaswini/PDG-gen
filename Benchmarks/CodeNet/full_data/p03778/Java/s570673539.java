import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a + w < b) {
            System.out.println(b - (a + w));
        } else if (b + w < a) {
            System.out.println(a - (b + w));
        } else {
            System.out.println(0);
        }
    }
}
