import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> ai = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            ai.add(sc.nextInt());
        }

        List<Integer> sorted = new ArrayList<>(ai);
        sorted.sort(Comparator.naturalOrder());

        int max = sorted.get(N - 1);

        int ans = 0;
        int x = 0;
        for (int a : ai) {
            int b = (a > max / 2) ? max - a : a;
            if (b > x) {
                ans = a;
                x = b;
            }
        }
        System.out.printf("%d %d\n", max, ans);

    }
}
