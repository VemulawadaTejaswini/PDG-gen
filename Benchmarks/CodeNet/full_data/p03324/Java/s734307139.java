import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        int N = scanner.nextInt();
        if (N == 100) {
            System.out.println(
                    (long) Math.pow(100, D) * (long) N + (int) Math.pow(100, D)
            );

        } else {
            System.out.println(
                    (long) Math.pow(100, D) * (long) N
            );
        }
    }
}
