import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main
{
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static void main(String args[])
    {
        FastReader obj = new FastReader();
        int n = obj.nextInt(),min = Integer.MAX_VALUE,max = Integer.MIN_VALUE,arr[] = new int[n];
        for(int i=0;i<n;i++) {arr[i] = obj.nextInt();if(min>arr[i])min = arr[i]; if(max<arr[i])max = arr[i];}
        TreeSet<Integer> data = new TreeSet<>();
        for(int i=min;i<=max;i++)
        {
            int sum =0;
            for(int j=0;j<n;j++)
                sum += (arr[j]-i)*(arr[j]-i);
            data.add(sum);
        }
        System.out.println(data.first());
    }
}
