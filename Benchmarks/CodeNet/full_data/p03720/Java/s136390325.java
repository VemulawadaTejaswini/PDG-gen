import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] graph = new int[n][n];
        for (int i = 0; i < m; i++) {
            int tmpFrom = sc.nextInt();
            int tmpTo = sc.nextInt();

            graph[tmpFrom-1][tmpTo-1]++;
            graph[tmpTo-1][tmpFrom-1]++;
        }


        for (int i = 0; i < n; i++) {
            int cityCount = 0;
            for (int j = 0; j < n; j++) {
                if (graph[i][j] > 0) cityCount += graph[i][j];
            }

            System.out.println(cityCount);
        }
    }
}
