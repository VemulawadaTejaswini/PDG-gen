
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastIO fio = new FastIO();
        int n, ans, currans;
        ArrayList<Integer> h = new ArrayList<>();

        n = fio.readInt();
        if(n==1)
        {
            System.out.println("0");
            return;
        }

        for (int i = 0; i < n; i++)
            h.add(fio.readInt());
        int i = 1, j;

        ans = 0;
        currans = 1;
        while (i < n) {
            j = i;
            currans = 1;
            while (j<n && h.get(j)<=h.get(j-1)) {
                ++j;
                ++currans;
            }
            if(currans>ans)
                ans=currans;
            i=j+1;
        }
        System.out.println(ans-1);
    }

    private static class FastIO {
        private StringTokenizer stringTokenizer;
        private BufferedReader bufferedReader;

        public FastIO() {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            stringTokenizer = null;
        }

        public String read() {
            if (stringTokenizer == null || !stringTokenizer.hasMoreTokens()) {
                try {
                    stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return stringTokenizer.nextToken();
        }

        public int readInt() {
            return Integer.parseInt(read());
        }

        public long readLong() {
            return Long.parseLong(read());
        }
    }
}