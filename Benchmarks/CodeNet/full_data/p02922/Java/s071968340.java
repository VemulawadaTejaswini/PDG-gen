import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        int a,b,ans=0;
        FastIO fastIO = new FastIO(System.in);

        a=fastIO.nextInt();
        b=fastIO.nextInt();

        while(b>0)
        {
            b-=a;
            if(ans!=0)
                b+=1;
            ++ans;
        }
        System.out.println(ans);
    }
}

class FastIO
{
    public BufferedReader reader;
    public StringTokenizer tokenizer;

    public FastIO(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream), 32768);
        tokenizer = null;
    }

    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }
}
