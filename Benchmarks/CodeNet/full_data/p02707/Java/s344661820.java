import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] employees = new int[N];

        for (int i = 0; i < N - 1; i++) {
            int temp = scanner.nextInt();
            employees[temp - 1]++;
        }

        scanner.close();

        for (int i : employees) {
            System.out.println(i);
        }

    }
}