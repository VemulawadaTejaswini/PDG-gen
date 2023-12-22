import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        int N;
        int[][] A;

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            A = new int[N][N - 1];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N - 1; j++) {
                    A[i][j] = sc.nextInt();
                }
            }
        }
        long result = 0;
        Deque<Integer>[] list = new Deque[N];
        for (int i = 0; i < N; i++) {
            Deque<Integer> target = new ArrayDeque<>(N);
            list[i] = target;
            for (int j = 0; j < N - 1; j++) {
                target.add(A[i][j]);
            }
        }
        Integer[] nextCallenge = new Integer[N];
        for (int i = 0; i < N; i++) {
            nextCallenge[i] = list[i].poll();
        }

        long game = 0;
        long maxGame = (N * (N - 1)) / 2;

        long days = 1;

        Deque<Integer> gamePeple = new ArrayDeque<>(N);
        for (int j = 0; j < N; j++) {
            gamePeple.add(j + 1);
        }

        while (true) {
            Set<Integer> set = new HashSet<>();
            Integer p1;
            while ((p1 = gamePeple.poll()) != null) {
                //対戦相手を調査.
                if (nextCallenge[p1 - 1] == null) {
                    continue;
                }

                int p2 = nextCallenge[p1 - 1];
                int temp = nextCallenge[p2 - 1];
                if (p1 == temp) {
                    boolean b1 = set.add(p1);
                    boolean b2 = set.add(p2);
                    //System.out.println(p1 + ":" + p2);
                    if (b1 && b2) {
                        game++;
                    }
                }
            }
            if (maxGame == game) {
                System.out.println(days);
                break;
            }
            //もう入れらんない
            if (set.isEmpty()) {
                System.out.println(-1);
                break;
            }
            for (Integer i : set) {
                nextCallenge[i - 1] = list[i - 1].poll();
                gamePeple.add(i);
            }

            days++;

        }

    }

}
