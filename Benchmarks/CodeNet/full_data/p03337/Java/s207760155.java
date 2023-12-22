import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = -(int)Math.pow(10, 9);
        res = Math.max(a + b, Math.max(a - b, Math.max(a * b, res)));
        System.out.println(res);
        sc.close();
    }
}