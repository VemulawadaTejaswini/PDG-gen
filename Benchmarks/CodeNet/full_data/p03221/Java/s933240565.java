import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] P = new int[M];
        int[] Y = new int[M];
        ArrayList<ArrayList<Integer>> years = new ArrayList<ArrayList<Integer>>(N+1);
        for (int i = 0; i < N+1; i++) years.add(new ArrayList<Integer>());

        for (int i = 0; i < M; i++) {
            P[i] = sc.nextInt();
            Y[i] = sc.nextInt();

            years.get(P[i]).add(Y[i]);
        }

        for (int i = 1; i < N+1; i++) {
            Collections.sort(years.get(i));
        }

        for (int i = 0; i < M; i++) {
            int pos = years.get(P[i]).indexOf(Y[i]) + 1;
            System.out.println(String.format("%06d%06d", P[i], pos));
        }
    }
}
