import java.io.*;
import java.util.*;
public class Main {
    static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String line;
    static  long n,k,T,N,m,A,B;
    static StringTokenizer st;
    static Scanner in = new Scanner(System.in);
    static char [] word;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Long.parseLong(st.nextToken());
        A = Long.parseLong(st.nextToken());
        B = Long.parseLong(st.nextToken());
        long sum = A+B;
        long divisor = N/sum;
        long value = N-divisor*sum;
        long answer = 0;
        if (value<A)
            answer+=value;
        else
            answer+=A;
        answer+=(divisor*A);
        pw.print(answer);
        pw.flush();

    }
}