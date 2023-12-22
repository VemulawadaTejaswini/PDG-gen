import java.util.*;
import java.io.*;
import java.lang.*;
class Main {
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static boolean check_lunlun(long n){
        if(n<=10){
            return  true;
        }
        long prev=n%10;
        n=n/10;
        while(n>0){
            long curr=n%10;
            if(Math.abs(prev-curr)>1){
                return false;
            }
            prev=curr;
            n=n/10;
        }
        return true;
    }
    public static void main(String[] args) {
        FastReader ob = new FastReader();
        int k = ob.nextInt();
        Queue<Long> q  = new LinkedList<>();
        for (int i = 1; i <10 ; i++) {
            q.add((long)i);
        }
        for (int i = 0; i <k-1 ; i++) {
            long num = q.poll();
            if(num%10!=0){
                q.add(10*num+(num%10)-1);
            }
            q.add(num*10+(num%10));
            if(num%10!=9){
                q.add(num%10+10*num+1);
            }
        }
        System.out.println((long)q.peek());
    }
}