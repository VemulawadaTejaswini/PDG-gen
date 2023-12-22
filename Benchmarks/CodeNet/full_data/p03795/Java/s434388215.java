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
        int money = n*800;
        int ret = 200*(int)(n/15);
        System.out.println(money-ret);
    }
}
