import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        String result = "No";

        int ca = Math.abs(c - a);
        int ba = Math.abs(b - a);
        int cb = Math.abs(c - b);

        if (ca <= d || (ba <= d && cb <= d)) {
            result = "Yes";
        }


        System.out.println(result);

    }
}