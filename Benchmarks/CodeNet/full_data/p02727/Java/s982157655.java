import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class Main {
    static ArrayList<Integer>[]adj;
    static void bfs(int s,int []d){
        Arrays.fill(d,-1);
        d[s]=0;
        Queue<Integer>q= new LinkedList<>();
        ((LinkedList<Integer>) q).add(s);
        while (!q.isEmpty()){
            int u = q.poll();
            for (int v:adj[u]){
                if (d[v]==-1){
                    d[v]=1+d[u];
                    ((LinkedList<Integer>) q).add(v);
                }
            }
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int x = sc.nextInt(),y=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        PriorityQueue<Integer>red= new PriorityQueue<>(),green= new PriorityQueue<>(),non = new PriorityQueue<>(Collections.reverseOrder());
        while (a-->0)red.add(sc.nextInt());
        while (b-->0)green.add(sc.nextInt());
        while (c-->0)non.add(sc.nextInt());
        while (red.size()>x)red.poll();
        while (green.size()>y)green.poll();
        while (!non.isEmpty()&&(green.peek()<non.peek()||red.peek()<non.peek())){
            if (green.peek()<red.peek()){
                green.poll();
                green.add(non.poll());
            }
            else {
                red.poll();
                red.add(non.poll());
            }
        }
        long ans=0;
        while (!red.isEmpty())ans+=red.poll();
        while (!green.isEmpty())ans+=green.poll();
        pw.println(ans);
        pw.flush();
    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(FileReader r) {
            br = new BufferedReader(r);
        }

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            String x = next();
            StringBuilder sb = new StringBuilder("0");
            double res = 0, f = 1;
            boolean dec = false, neg = false;
            int start = 0;
            if (x.charAt(0) == '-') {
                neg = true;
                start++;
            }
            for (int i = start; i < x.length(); i++)
                if (x.charAt(i) == '.') {
                    res = Long.parseLong(sb.toString());
                    sb = new StringBuilder("0");
                    dec = true;
                } else {
                    sb.append(x.charAt(i));
                    if (dec)
                        f *= 10;
                }
            res += Long.parseLong(sb.toString()) / f;
            return res * (neg ? -1 : 1);
        }

        public boolean ready() throws IOException {
            return br.ready();
        }
    }

}