import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by hikigineer on 2017/03/04.
 */
public class Main {
    static Scanner in;
    static PrintWriter out;
    static String INPUT = "";

    static int[] n;
    static int[][] distance;
    static int D, N;

    public static void main(String[] args) throws Exception
    {
        in = INPUT.isEmpty() ? new Scanner(System.in) : new Scanner(INPUT);
        out = new PrintWriter(System.out);
        N = ni();
        int M = ni();
        n = new int[N];
        distance = new int[N][N];
        int i, j, k;
        int a, b;
        for(i = 0; i < M; i++)
        {
            a = ni() - 1;
            b = ni() - 1;
            distance[a][b] = 1;
            distance[b][a] = 1;
        }
        int Q = ni();
        int v, c;
        for(i = 0; i < Q; i++)
        {
            v = ni();
            D = ni();
            c = ni();
            color(v - 1, v - 1, 1, c);
        }

        for(i = 0; i < N; i++) out.println(n[i]);

        out.flush();
    }

    private static void color(int originV, int currentV, int d, int col)
    {
        if(D < d)
            return;
        n[currentV] = col;
        int i;
        for(i = 0; i < N; i++)
        {
            if(distance[currentV][i] != 0)
            {
                n[i] = col;
                if(distance[originV][i] > d)
                    distance[originV][i] = d;
                color(originV, i, d + distance[currentV][i], col);
            }
        }
    }

    static int ni() {
        return Integer.parseInt(in.next());
    }

}
