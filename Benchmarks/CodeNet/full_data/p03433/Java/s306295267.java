import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();

        int rem = N % 500;
        String judge = A >= rem ? "Yes" : "No";
        System.out.println(judge);
    }
}