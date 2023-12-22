import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)
    {
        Reader r=new Reader();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int N=r.nextInt();
        int[] arr= new int[N];
        for(int i=0; i<N; i++)
        {
            arr[i]=r.nextInt();
        }
        solve(arr, out);
        out.close();

    }
    static void solve(int[] arr, PrintWriter out)
    {
        for(int i=0; i<arr.length-1; i++)
        {
            if(arr[i]<0 && arr[i+1]<0)
            {
                arr[i]=Math.abs(arr[i]);
                arr[i+1]=Math.abs(arr[i+1]);
            }
            else if(arr[i]<0 && Math.abs(arr[i])>=Math.abs(arr[i+1]))
            {
                arr[i]=Math.abs(arr[i]);
                arr[i+1]=-1*Math.abs(arr[i+1]);
            }
        }
        System.out.println(sum(arr));
    }
    static long sum(int[] arr)
    {
        long sum=0;
        for(int i=0; i<arr.length; i++)
        {
            sum+=arr[i];
        }
        return sum;
    }

    //Fast I/O class
    static class Reader
    {
        BufferedReader br;
        StringTokenizer st;

        public Reader() {
            br = new BufferedReader(new InputStreamReader(System.in));
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

        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }


}
