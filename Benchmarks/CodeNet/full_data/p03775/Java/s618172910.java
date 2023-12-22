import java.io.PrintWriter;
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
        long N = nl();

        int halfN = (int)Math.sqrt(N);

        int min = 10;
        int A;
        long B;
        for(A = 1; A <= halfN; A++)
        {
            if(N % A == 0)
            {
                B = N / A;
                int F = (int)Math.log10(B) + 1;
                if(min > F)
                    min = F;
            }
        }

        out.println(min);
        out.flush();
    }

    static long nl() {
        return Long.parseLong(in.next());
    }
}