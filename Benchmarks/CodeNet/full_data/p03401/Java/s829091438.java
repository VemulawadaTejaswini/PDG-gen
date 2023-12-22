import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(scanner.nextInt());
        }
        scanner.close();

        for (int i = 0; i < N; i++) {
            int count = 0;
            int current = 0;
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    continue;
                }
                count += Math.abs(A.get(j) - current);
                current = A.get(j);
            }
            count += Math.abs(current);
            System.out.println(count);
        }

    }
}
