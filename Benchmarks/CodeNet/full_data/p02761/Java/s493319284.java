import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
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
        int n = obj.nextInt(),arr[] = new int[n],m = obj.nextInt();
        boolean flag = false;
        for(int i=0;i<m;i++)
        {
            int a = obj.nextInt(),b = obj.nextInt();
            if(arr[a-1]==0 || arr[a-1]==b) arr[a-1] = b;
            else {flag = true;break;}
        }
        if(flag ||(arr[0]==0 && arr[1]!=0)) System.out.println(-1);
        else if(arr[0]==0 && arr[1]==0 && arr[2]==0) System.out.print(0);
        else for(int i=0;i<n;i++)System.out.print(arr[i]);
    }
}
