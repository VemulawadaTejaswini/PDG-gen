import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int answer = (int)Math.ceil((-1.0 + Math.sqrt(1 + 8 * n)) / 2.0);
        System.out.println(answer);
    }
}
