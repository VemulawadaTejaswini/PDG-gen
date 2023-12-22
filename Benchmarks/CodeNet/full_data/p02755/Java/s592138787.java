import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = 1;
        while (x <= 1009) {
            if (Math.floor(x * 0.08) == a && Math.floor(x * 10) == b) {
                break;
            }
            x++;
        }
        if (x < 1009) {
            System.out.println(x);
        } else {
            System.out.println("-1");
        }
    }
}