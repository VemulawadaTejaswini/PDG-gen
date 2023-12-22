import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by mixnector on 2017/03/04.
 */
public class Main {
    static Scanner in;
    static PrintWriter out;
    static String INPUT = "";

    public static void main(String[] args) throws Exception
    {
        in = INPUT.isEmpty() ? new Scanner(System.in) : new Scanner(INPUT);
        out = new PrintWriter(System.out);
        int N = ni();
        long C = nl();
        long K = nl();
        long T[] = new long[N];
        for(int i = 0; i < N; i++) { T[i] = nl(); }
        Arrays.sort(T);
        long count = 1;
        long nowTime = T[0];
        long countTime = 0;
        long result = 1;

        for(int i = 1; i < N; i++)
        {
            count++;
            countTime += T[i] - nowTime;
            if(count > C || countTime >= K)
            {
                result++;
                count = 1;
                countTime = 0;
            }
            nowTime = T[i];
        }
        out.println(result);
        out.flush();
    }
    static int ni() { return Integer.parseInt(in.next()); }
    static long nl() { return Long.parseLong(in.next()); }
}