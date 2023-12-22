import java.io.*;
import java.util.*;

class Main{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] dist = new int[n + 1];
        int maxSoFar = 0;

        Arrays.fill(dist ,0);

        for(int i = 0; i < m; i++){
            int from = in.nextInt();
            int to = in.nextInt();

            dist[to] = Math.max(dist[to], dist[from] + 1);
            maxSoFar = Math.max(maxSoFar, dist[to]);

        }

        System.out.println(maxSoFar);
    }

}