
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static int dp[];
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



    public static void main(String[] args)throws IOException {
        FastReader fr = new FastReader();
        int n=fr.nextInt();
        int m=fr.nextInt();
        HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();
        for(int i=0;i<m;i++)
        {
            int k=fr.nextInt();
            int v=fr.nextInt();
            if(hm.containsKey(k))
            {
                ArrayList<Integer> t=hm.get(k);
                t.add(v);
                hm.put(k,t);}
            else {
                ArrayList<Integer> t=new ArrayList<>();
                t.add(v);
                hm.put(k,t);
            }
        }
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        int max=-1;
        for(int i:hm.keySet())
            max=Math.max(max,dfs(hm,i));
        System.out.println(max);

    }
    public static int dfs(HashMap<Integer,ArrayList<Integer>> hm,int v)
    {
        int max=0;
        if(dp[v]!=-1)
            return dp[v];
        if(hm.containsKey(v)){
            for(int i=0;i<hm.get(v).size();i++)
            {
                max=Math.max(max,1+dfs(hm,hm.get(v).get(i)));
            }
        }

        return dp[v]= max;
    }




}
