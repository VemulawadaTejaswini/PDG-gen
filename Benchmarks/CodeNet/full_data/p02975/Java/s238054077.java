import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());

        String[] values = scanner.nextLine().split(" ");
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(values[i]);
        }

        int sum = a[0];
        for (int i = 1; i < N; i++) {

            sum = sum ^ a[i];

        }

        System.out.println(sum == 0 ? "Yes" : "No");

        scanner.close();

    }

}
