import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int k;
    long[] d;
    public static void main(String[] args) throws IOException {
        Main main = new Main();
//        main.solve();
        System.out.println(main.solve());
    }
    int solve() throws IOException{
        int a = sc.nextInt(), b = sc.nextInt();
        for(int i=1;i<1000000;i++){
            if(valid(i,a,b)) return i;
        }
        return -1;
    }
    boolean valid(int x, int a, int b){
        int y1 = 8*x/100, y2 = x/10;
        return y1==a&&y2==b;
    }
}

