import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            result.add(0);
        }
        for (int i = 0; i < N - 1; i++) {
            int tmp = scan.nextInt();
            result.set(tmp - 1, result.get(tmp - 1) + 1);
        }

        for (Integer r : result) {
            System.out.println(r);
        }

    }
}
