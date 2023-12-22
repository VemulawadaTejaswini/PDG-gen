import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = Long.parseLong(scanner.nextLine());

        long i;
        for (i = 1; i * (i + 1) < 2 * N; i++) {
            // none
        }
        if (i * (i + 1) == 2 * N) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
