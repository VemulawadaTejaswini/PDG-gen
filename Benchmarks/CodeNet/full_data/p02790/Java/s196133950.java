import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.System.*;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        StringBuilder as = new StringBuilder();
        StringBuilder bs = new StringBuilder();
        for (int i = 0; i < b; i++) {
            as.append(String.valueOf(a));
        }
        for (int i = 0; i < a; i++) {
            bs.append(String.valueOf(b));
        }
        if (as.compareTo(bs) <= 0) {
            out.println(as.toString());
        } else {
            out.println(bs.toString());
        }
    }

}
