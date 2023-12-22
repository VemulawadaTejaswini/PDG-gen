import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int x = a * 10 + b + c;
        int y = a + b * 10 + c;
        int z = a + b + c * 10;

        System.out.println(Math.max(Math.max(x, y), z));
    }
}
