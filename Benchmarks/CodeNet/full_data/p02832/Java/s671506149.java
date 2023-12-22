
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] a = new int[N];
        for (int i = 0 ; i < N ; i++) {
            a[i] = scanner.nextInt();
        }

        int count = 0;
        int current = 1;
        for (int i = 0 ; i < N ; i++) {
            if (a[i] == current) {
                current++;
            } else {
                count++;
            }
        }

        if (current == 1) {
            System.out.println(-1);
        } else {
            System.out.println(count);
        }
    }
}
