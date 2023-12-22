import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int x = 1900 * M + 100 * (N-M);

        int pow = (int)Math.pow(2, M);

        System.out.println(x * pow);

    }
}
