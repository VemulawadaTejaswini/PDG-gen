import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Main {
    public static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

    public static int nextInt() {
        try {
            in.nextToken();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return (int) in.nval;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int n = nextInt(), a[] = new int[n + 1], num[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = nextInt();
            num[a[i]]++;
        }
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            if (num[i] > 1)
                sum += num[i] * (num[i] - 1) / 2;
        }
        for (int i = 1; i <= n; i++) {
            int m = num[a[i]];
            out.println(sum - m + 1);
        }
        out.flush();
    }

}
