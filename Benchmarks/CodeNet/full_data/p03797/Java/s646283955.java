import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;
public class Main {
    static ArrayList<Integer>[] vertice;
    static int ans = 0;
    static int total = 0;
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int n = in.nextInt();
        int m = in.nextInt();
        int need = n*2;
        if (need<=m){
            m-=need;
            int left = (int)(m/4);
            System.out.println(left+n);
        }
        else {
            System.out.println((int)(m/2));
        }
    }
}
