import java.util.Scanner;

/**
 * Created by gumio_inf on 2016/12/02.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (1 <= a && a <= 100 && 1 <= b && b <= 100 && 1 <= c && c <= 100) {
            int sum = a + b + c;
            String flag = (a + b + c) % 3 == 0 ? "YES" : "NO";
            System.out.println(flag);
        }
    }
}
