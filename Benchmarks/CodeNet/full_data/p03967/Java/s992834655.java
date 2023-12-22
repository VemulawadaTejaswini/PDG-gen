import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    BufferedReader rd;

    Main() throws IOException {
        rd = new BufferedReader(new InputStreamReader(System.in));
        compute();
    }

    private void compute() throws IOException {
        char[] c = rd.readLine().toCharArray();
        int n = c.length;
        int p = 0;
        int g = 0;
        int score = 0;
        for(int i=0;i<n;i++) {
            if(c[i] == 'g') {
                if(p+1 <= g) {
                    p++;
                    score++;
                } else {
                    g++;
                }
            } else {
                if(p+1 <= g) {
                    p++;
                } else {
                    g++;
                    score--;
                }
            }
        }
        out(score);
    }

    private static void out(Object x) {
        System.out.println(x);
    }

    public static void main(String[] args) throws IOException {
        new Main();
    }
}
