import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] L = new int[N];
        for (int i = 0; i < N; i++) {
            L[i] = scanner.nextInt();
        }
        scanner.close();

        long count = 0;

        // nC2
        ArrayList<int[]> nC2ArrayList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int[] ints = new int[2];
                ints[0] = i;
                ints[1] = j;
                nC2ArrayList.add(ints);
            }
        }

        // calc
        int[][][] counted = new int[N][N][N];

        for (int i = 0; i < N; i++) {
            int a = L[i];
            //nC2
            for (int[] v : nC2ArrayList) {
                if (v[0] == i || v[1] == i) {
                    continue;
                }
                if(counted[i][v[0]][v[1]] == 1){
                    continue;
                }
                counted[i][v[0]][v[1]] = 1;
                counted[i][v[1]][v[0]] = 1;
                counted[v[0]][i][v[1]] = 1;
                counted[v[0]][v[1]][i] = 1;
                counted[v[1]][i][v[0]] = 1;
                counted[v[1]][v[0]][i] = 1;

                int b = L[v[0]];
                int c = L[v[1]];

                if ((a < b + c) && (b < a + c) && (c < a + b)) {
                    count++;
                }
            }
        }

        System.out.println(count);

    }

}

