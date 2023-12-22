import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] P = new int[M];
        int[] Y = new int[M];

        List<List<Integer>> prefList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            prefList.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            P[i] = scanner.nextInt();
            Y[i] = scanner.nextInt();

            List<Integer> list = prefList.get(P[i] - 1);
            list.add(Y[i]);
        }
        for (List<Integer> list : prefList) {
            Collections.sort(list);
        }

        for (int i = 0; i < M; i++) {
            List<Integer> list = prefList.get(P[i] - 1);
            int index = list.indexOf(Y[i]);
            System.out.println(padLeft(P[i]) + padLeft(index + 1));
        }
    }

    public static String padLeft(int i) {
        return String.format("%06d", i);
    }

}
