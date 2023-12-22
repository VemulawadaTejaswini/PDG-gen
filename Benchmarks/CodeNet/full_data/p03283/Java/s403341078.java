import java.util.*;

/**
 * Created by Santa.
 */
public class Main {

    static int N;
    static int M;
    static int Q;
    static int A;
    static long B;
    static long C;
    //    static int[][] map;
    static int min = 9999999;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        N = scanner.nextInt();
        M = scanner.nextInt();
        Q = scanner.nextInt();
        int[][] map  = new int[N][N];

        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            map[a][b]++;
        }

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                map[i][j] += map[i][j - 1];
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = N - 2; j >= 0 ; j--) {
                map[j][i] += map[j + 1][i];
            }
        }
//
//        System.out.println();
//
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++) {
//                System.out.print(map[i][j]);
//            }
//            System.out.println();
//        }

        for (int i = 0; i < Q; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;

            System.out.println(map[a][b]);
        }

        

    }
}

