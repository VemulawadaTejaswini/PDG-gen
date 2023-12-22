import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    static String br = System.getProperty("line.separator");
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int N = nextInt();
        int K = nextInt();
        int[] h = new int[N];

        int Answer = 0;

        for(int i=0; i<N; i++){
            h[i] = nextInt();
        }

        for (int i=0; i<N; i++) {
        	if (h[i] >= K) {
        		Answer += 1;
        	}
        }

        println(Answer);
    }

    static int nextInt() {
        return Integer.parseInt(next());
    }

    static Long nextLong() {
        return Long.parseLong(next());
    }

    static String next() {
        return sc.next();
    }

    static String nextLine(){
        return sc.nextLine();
    }

    static void println(Object o) {
        out.println(o);
        out.flush();
    }

    static void print(Object o) {
        PrintWriter out = new PrintWriter(System.out);
        out.print(o);
        out.flush();
    }
}