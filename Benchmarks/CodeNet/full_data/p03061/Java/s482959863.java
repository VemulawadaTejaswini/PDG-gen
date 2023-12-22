import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)
    {
        Reader r=new Reader();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int N=r.nextInt();
        int[] arr=new int[N];
        for(int i=0; i<N; i++)
        {
            arr[i]=r.nextInt();
        }
        solve(arr, out);
        out.close();



    }
    static void solve(int[] arr, PrintWriter out)
    {
        if(arr.length==2)
        {
            out.println(Math.max(arr[1], arr[0]));
            return;
        }
        int[] values=new int[arr.length];
        for(int i=0; i<arr.length; i++)
        {
            ArrayList<Integer> temp=new ArrayList<>();
            for(int j=0; j<arr.length; j++)
            {
                if(j!=i)
                {
                    temp.add(arr[j]);
                }
            }
            values[i]=gcd(temp);
        }
        System.out.println(findMax(values));
        out.println(findMax(values));

    }
    static int findMax(int[] arr)
    {
        int max=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>=max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    static int gcd(ArrayList<Integer> list)
    {
        if(list.size()==2)
        {
            return euclid(list.get(0), list.get(1));
        }
        int temp= list.get(0);
        list.remove(0);
        return euclid(temp, gcd(list));
    }
    // Euclidean Algorithm
    static int euclid(int a, int b)
    {
        if(a==1||b==1)
        {
            return 1;
        }else if(a==0 || b==0)
        {
            if(a==0)
            {
                return b;
            }
            else {
                return a;
            }
        }
        if(a>b)
        {
            return euclid(a%b, b);
        }
        return euclid(a, b%a);
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
