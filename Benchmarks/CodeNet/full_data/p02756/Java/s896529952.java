import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Main{
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

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        in.nextToken();
        String s = in.sval;
        String pre = "";
        String suf = "";
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int n = nextInt(), a = 0;
        for (int i = 0; i < n; i++) {
            int op = nextInt();
            if (op == 1)
                a++;
            else {
                int x = nextInt();
                in.nextToken();
                String c = in.sval;
                int f = a & 1;
                if (f == 0)
                    if (x == 1) {
                        pre = c + pre;
                    } else
                        suf = suf + c;
                else {
                    if (x == 1) {
                        suf = suf + c;
                    } else
                        pre = c + pre;
                }
            }
        }

        int f = a & 1;
        StringBuffer sb = new StringBuffer(pre + s + suf);
        if (f == 0) {

            out.println(sb.toString());
        } else {
            out.println(sb.reverse().toString());
        }
        out.flush();
    }

}
