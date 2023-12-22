import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();
        scanner.close();

        // 桁数
        int length = N.length();
        int c = Integer.valueOf(N.substring(0, 1));
        c = (c == 9) ? c : c - 1;
        int max = c + 9 * (length - 1);

        System.out.println(max);
    }
}
