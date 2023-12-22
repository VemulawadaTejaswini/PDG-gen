import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int size = (1 << N);
        int[] S = new int[size];
        boolean[] spawned = new boolean[size];
        spawned[size - 1] = true;

        for (int i = 0; i < size; i++) S[i] = sc.nextInt();

        Arrays.sort(S);

        List<List<Integer>> generations = new ArrayList<>();
        List<Integer> firstGeneration = new ArrayList<>();
        firstGeneration.add(S[size - 1]);
        generations.add(firstGeneration);

        for (int i = 0; i < N; i++) {
            int next = size - 1;
            List<Integer> nextGeneration = new ArrayList<>();
            for (List<Integer> generation : generations) {
                for (int slime : generation) {
                    while (next >= 0 && (spawned[next] || S[next] >= slime)) {
                        next--;
                    }
                    if (next < 0) {
                        System.out.println("No");
                        return;
                    }
                    spawned[next] = true;
                    nextGeneration.add(S[next]);
                }
            }
            generations.add(nextGeneration);
        }

        System.out.println("Yes");
    }
}
