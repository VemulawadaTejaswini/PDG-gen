import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        int K = Integer.parseInt(scanner.next());
        char[] S = scanner.next().toCharArray();
        scanner.close();

        S[K - 1] = String.valueOf(S[K-1]).toLowerCase().charAt(0);

        System.out.println(String.valueOf(S));
    }
}
