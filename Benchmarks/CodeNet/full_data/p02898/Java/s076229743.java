import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        int K = Integer.parseInt(scanner.next());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(scanner.next());
        }
        scanner.close();

        int count = 0;
        for (int height : arr) {
            if (height >= K) {
                count++;
            }
        }

        System.out.println(count);
    }
}
