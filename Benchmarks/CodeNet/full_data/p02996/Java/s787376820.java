import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 *
 * @author dkcs
 */
class Main
{
    static class FastReader {
        
        BufferedReader br;
        StringTokenizer st;
        
        public FastReader() {
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
    
    static class NodeX {
        
       long a,b;
       NodeX(long x,long y)
       {
           a=x;
           b=y;
       }
    }
    
    static class CompX implements Comparator<NodeX> {
        
        public int compare(NodeX o1, NodeX o2) {
            if (o1.b > o2.b) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    public static void main(String[] args) 
    {
        FastReader sc = new FastReader();
        int n=sc.nextInt();
        PriorityQueue<NodeX> pq=new PriorityQueue(new CompX());
        for(int i=0;i<n;i++)
        {
            long a=sc.nextLong();
            long b=sc.nextLong();
            pq.add(new NodeX(a,b));
        }
        long sum=0;
        while(!pq.isEmpty())
        {
            NodeX t=pq.poll();
            sum=sum+t.a;
            if(sum>t.b)
            {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");           
    }
    
    
}
