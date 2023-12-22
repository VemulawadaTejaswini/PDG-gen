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

    public static void main(String[] args) throws Exception {
        in = INPUT.isEmpty() ? new Scanner(System.in) : new Scanner(INPUT);
        out = new PrintWriter(System.out);
        int N = ni();
        long K = nl();
        char[] S = in.next().toCharArray();
        int i;
        for(i = 0; i < K; i++)
        {
            int index = 0;
            boolean left = false;
            while(true)
            {
                if(S[index] == 'A')
                {
                    S[index] = 'B';
                    left = !left;
                    if(index == 0 && left)
                        break;
                }
                else if(S[index] == 'B')
                {
                    S[index] = 'A';
                    if(index == N - 1)
                        break;
                }
                if(left)
                    index--;
                else
                    index++;
            }
        }
        out.println(S);
        out.flush();
    }

    static int ni() {
        return Integer.parseInt(in.next());
    }

    static long nl() {
        return Long.parseLong(in.next());
    }
}