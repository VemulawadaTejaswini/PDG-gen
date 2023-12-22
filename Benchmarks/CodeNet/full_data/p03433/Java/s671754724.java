import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    static Scanner in;
    static PrintWriter out;


    static final int mod = (int) 1e9 + 7;
    static final int inf = 0x3f3f3f3f;
    static final int maxn = (int) 500 + 2;
    static int total;
    static int[] par = new int[maxn];

    public static void main(String[] args) throws Exception {
        //Test.main();
        try {
            System.setIn(new FileInputStream("night_input"));
        } catch (FileNotFoundException e) {

        }

        in = new Scanner(System.in);
        out = new PrintWriter(System.out);

        while (in.hasNext()) {
            int n = in.nextInt();
            int a = in.nextInt();
            out.println(n % 500 <= a ? "Yes" : "No");
        }

        in.close();
        out.close();
    }

    static int find(int x) {
        return (par[x] = par[x] == x ? x : find(par[x]));
    }

    static void init() {
        total = 0;
        for (int i = 0; i < par.length; ++i) {
            par[i] = i;
        }
    }
}
