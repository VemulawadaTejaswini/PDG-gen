
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] values = new int[N];
        for (int i=0; i<N; i++) {
            values[i] = scanner.nextInt();
        }
        int count = 0;
        hoge: while (true) {
            for (int i=0; i<N; i++) {
                if (values[i] % 2 != 0) {
                    break hoge;
                }
                values[i] = values[i] / 2;
            }
            count++;
        }
        System.out.println(count);
    }
}
