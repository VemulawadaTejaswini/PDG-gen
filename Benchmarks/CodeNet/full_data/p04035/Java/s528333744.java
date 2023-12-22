import java.io.*;
import java.util.StringTokenizer;

public class Knot {

    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(f.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        int[] a = new int[n];
        boolean can = false;
        int index = -1;
        StringTokenizer st1 = new StringTokenizer(f.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st1.nextToken());
        }
        for (int i = 0; i < n-1; i++) {
            if((a[i]+a[i+1]) >=l ){
                can = true;
                index = i;
            }
        }

        if (can == false) {
            out.println("Impossible");
        } else {
            out.println("Possible");
            for (int i = 0; i < index; i++) {
                out.println(i+1);
            }
            for (int i = index + 1; i < n - 1; i++) {
                out.println(i+1);
            }
            out.println(index+1);
        }

        out.close();

    }
}
