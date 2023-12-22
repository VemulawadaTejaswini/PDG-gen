import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int n = nextInt();
        int[] d = new int[n];
        for(int i = 0; i < n; i++){
            d[i] = nextInt();
        }

        int Answer = 0;

        for (int i = 0; i < n - 1; i++) {
        	for (int j = i + 1; j < n; j++) {
        		Answer += d[i] * d[j];
        	}
        }

        println(Answer);
    }

    static int nextInt() {
        return Integer.parseInt(next());
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

}
