import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int n = nextInt();
        int[] a = new int[n];

        int Answer = 0;

        for(int i = 0; i < n; i++){
            a[i] = nextInt();
        }

        for (int i = 0; i < n - 2; i ++) {
        	for (int j = i + 1; j < n - 1; j++) {
        		for (int k = j + 1; k < n; k++) {
        			Answer += check(a[i], a[j], a[k]);
        		}
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

    static int check(int i, int j, int k) {
    	if (i + j <= k) {
    		return 0;
    	}
    	if (j + k <= i) {
    		return 0;
    	}
    	if (k + i <= j) {
    		return 0;
    	}
    	return 1;
    }

}
