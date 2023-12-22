import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        ArrayList<Integer> A1 = new ArrayList<>();
        ArrayList<Integer> A2 = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A1.add(scanner.nextInt());
        }
        for (int i = 0; i < N; i++) {
            A2.add(scanner.nextInt());
        }
        scanner.close();

        int x = 1;
        int j = 0;
        int count = 0;
        while (x == 1) {
            count += A1.get(j);
            if (j + 1 == N) {
                x++;
                break;
            }
            if ((A2.get(j)) < (A1.get(j + 1) + A2.get(j + 1))) {
                j++;
            } else {
                x++;
            }
        }
        while (x == 2 && j < N) {
            count += A2.get(j);
            j++;

        }

        System.out.println(count);
    }
}