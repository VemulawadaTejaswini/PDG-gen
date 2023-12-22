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
    static boolean containV(boolean arr[][],int y)
    {
        boolean flag = true;
           for(int i=0;i<3;i++) flag &=arr[i][y];
        return flag;
    }
    static boolean containH(boolean arr[][],int x)
    {
        boolean flag = true;
        for(int i=0;i<3;i++) flag &=arr[x][i];
        return flag;
    }
    static boolean containD(boolean arr[][])
    {
        boolean flag = true;
        for(int i=0;i<3;i++) flag &=arr[i][i];
        return flag;
    }
    public static void main(String args[])
    {
        FastReader obj = new FastReader();
        int arr[][] = new int[3][3];
        boolean bool[][] = new boolean[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
                arr[i][j] = obj.nextInt();
        }
        int n = obj.nextInt();
        for(int i=0;i<n;i++)
        {
            int k = obj.nextInt();
            for(int u=0;u<3;u++)
            {
                for(int j=0;j<3;j++)
                    if(arr[u][j]==k)
                    {
                        bool[u][j] = true;
                        break;
                    }
            }
        }
        boolean flag = false;
        for(int i=0;i<3;i++)  flag |= containH(bool,i);
        for(int i=0;i<3;i++) flag |= containV(bool,i);
        flag |= containD(bool);
        System.out.println((flag || (bool[2][0] & bool[1][1] & bool[0][2]))?"Yes":"No");
    }
}
