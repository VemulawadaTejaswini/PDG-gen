import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int cur = in.nextInt();
        int c = 0;int dif;
        for(int i =1;i<n;i++){
            int next = in.nextInt();
            dif = next-cur;
            cur = next;
            c+= Math.min(b,dif*a);
        }
        System.out.println(c);

    }
}
