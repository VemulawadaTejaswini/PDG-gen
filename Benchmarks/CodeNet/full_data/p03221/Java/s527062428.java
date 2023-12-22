import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();
        int[][] cities = new int[M][2];
        int[][] prefectureToYears = new int[N][M];
        int[] prefectureCityCount = new int[N];

        for (int i = 0; i < M; i++) {
            int p = in.nextInt();
            int y = in.nextInt();
            cities[i] = new int[] {p, y};
            prefectureToYears[p - 1][prefectureCityCount[p - 1]] = y;
            prefectureCityCount[p - 1] = prefectureCityCount[p - 1] + 1;
        }

        for (int i = 0; i < N; i++) {
            Arrays.sort(prefectureToYears[i]);
        }

        for (int i = 0; i < M; i++) {
            int p = cities[i][0];
            int y = cities[i][1];

            int ans = Arrays.binarySearch(prefectureToYears[p - 1], y) + 1;
            ans = ans - (M - prefectureCityCount[p-1]);
            System.out.println(String.format("%06d", p) + String.format("%06d", ans));
        }
    }
}
