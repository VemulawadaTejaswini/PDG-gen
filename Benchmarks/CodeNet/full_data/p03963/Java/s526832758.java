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
        int k = in.nextInt();
        if (n==1)
            System.out.print(k);
        else
        {
            int s=k;
            for (int i=1;i<n;i++){
                s*=(k-1);
            }
            System.out.print(s);
        }
    }
}