import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;
import java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int n = in.nextInt();
        int total = 0;
        int[] time = new int[n+1];
        for(int i=1;i<=n;i++){
            int t = in.nextInt();
            total+=t;
            time[i]=t;
        }
        int m = in.nextInt();
        for(int i=0;i<m;i++){
            int p = in.nextInt();
            int t = in.nextInt();
            int dif = Math.abs(time[p]-t);
            if (t>time[p])
                out.println(total+dif);
            else
                out.println(total-dif);

        }
        out.close();



    }
}