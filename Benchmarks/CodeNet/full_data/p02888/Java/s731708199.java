import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int n = nextInt();
        Integer[] a = new Integer[n];

        int Answer = 0;

        for(int i = 0; i < n; i++){
            a[i] = nextInt();
        }

        Arrays.sort(a, Comparator.reverseOrder());

        for (int i = 0; i < n - 2; i ++) {
        	for (int j = i + 1; j < n - 1; j++) {
        		for (int k = j + 1; k < n; k++) {
        			if (check(a[i], a[j], a[k])) {
        				Answer += 1;
        			} else {
        				break;
        			}
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

    static boolean check(int i, int j, int k) {
    	if (i + j <= k) {
    		return false;
    	}
    	if (j + k <= i) {
    		return false;
    	}
    	if (k + i <= j) {
    		return false;
    	}
    	return true;
    }

}