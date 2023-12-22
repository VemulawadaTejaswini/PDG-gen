import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int n = nextInt();
        int[] a = new int[n];
        int[] a2 = new int[n];
        int[] b = new int[n];

        boolean test = false;

        for(int i = 0; i < n; i++){
            a[i] = nextInt();
            a2[i] = a[i];
        }
        for(int i = 0; i < n; i++){
            b[i] = nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);

        boolean flag = true;

        for(int i = 0; i < n; i++){
        	if (i != 0 && a[i] == a[i-1]) {
        		test = true;
        	}
            if (a[i] > b[i]) {
            	flag = false;
            	break;
            }
        }

        boolean flag2 = true;

        if (flag) {
        	for (int i = 0; i < n - 1; i++) {
        		if (a[i + 1] == a2[i]) {
        			flag = false;;
        		}
        	}
        	if (flag2) {
        		println("Yes");
        	} else {
        		println("No");
        	}
        } else {
        	println("No");
        }
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