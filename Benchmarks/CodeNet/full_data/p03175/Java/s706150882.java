// Working program with FastReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.util.*;

public class pIndependentset
{
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

    //        long start = System.currentTimeMillis();
//        long end = System.currentTimeMillis();
//        System.out.println((end - start) + "ms");
    public static void main(String[] args)
    {
        FastReader s=new FastReader();
//        int t = s.nextInt();
//        for(int tt=0;tt<t;tt++){
            int n = s.nextInt();
            ArrayList<Integer>[] al = new ArrayList[n];
            for(int i=0;i<n;i++){
                al[i] = new ArrayList<Integer>();
            }
            for(int i=0;i<n-1;i++){
                int a = s.nextInt();
                int b = s.nextInt();
                al[a-1].add(b-1);
                al[b-1].add(a-1);
            }
            System.out.println(n_ways(n,al));
//        }
    }

    public static long n_ways(int n, ArrayList<Integer>[] al){
        if(n==1){
            return 2;
        }
        Stack<Integer> stack = new Stack<>();
        long[][] dp = new long[n][2];
        boolean[] visited = new boolean[n];
        boolean[] calculated = new boolean[n];
        int root =0;
        for(int i=0;i<n;i++){
            if(al[i].size()==1){
                stack.push(i);
                visited[i] = true;
                root =i;
                break;
            }
        }
        while (!stack.empty()){
            int a = stack.peek();
            boolean all_visited= true;
            for (int vertex:al[a]){
                if(!visited[vertex]){
                    all_visited = false;
                    stack.push(vertex);
                    visited[vertex] = true;
                }
            }
            if(all_visited){
                dp[a][0] =1;
                dp[a][1] = 1;
                for(int vertex:al[a]){
                    if(calculated[vertex]){
                            dp[a][0]*=(dp[vertex][0]+dp[vertex][1]);
                            dp[a][1]*=(dp[vertex][0]);
                    }
                }
                calculated[a] = true;
                stack.pop();
            }
        }
//        debug(dp);
//        System.out.println(root+" root");
        return (dp[root][0]+dp[root][1]);
    }


    public static void debug(long[][] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    public static void debug(int[][] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    public static void debug(String[] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.println(arr[i]);
        }
    }

    public static void print(int[] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print('\n');
    }
    public static void print(ArrayList<Integer>[] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print('\n');
    }
    public static void print(String[] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print('\n');
    }
    public static void print(long[] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print('\n');
    }






}
