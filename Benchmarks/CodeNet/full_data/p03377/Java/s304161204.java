import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        sc.close();

        if (a + b >= x && a <= x) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}