
import java.util.*;
import java.io.*;

public class Main {
    static char[][]s;
    static boolean bf(int id,int [] cur,HashSet<Integer> rem){
        if (rem.size()==0) {
            return check(cur);
        }
        int now =0;
        HashSet<Integer>nx=new HashSet<>();
        for (int x:rem) {
            now = x;
            nx.add(x);
        }
        rem.remove(now);
        nx.remove(now);
        boolean ans=false;
        for (int x:rem){
            nx.remove(x);
            cur[id]=now;
            cur[id+1]=x;
            ans|=bf(id+2,cur,nx);
            nx.add(x);
        }
        rem.add(now);
        return ans;
    }
    static boolean check(int []cur){
        char[][]ss= new char[s.length][s[0].length];
        int id=0;
        for (int i =0;i<s.length/2;i++){
            ss[i]=s[cur[id]].clone();
            ss[s.length-i-1]=s[cur[id+1]].clone();
            id+=2;
        }
        if (s.length%2==1)
            ss[s.length/2]=s[cur[cur.length-1]].clone();

        String[]set= new String[s[0].length];
        for (int i =0;i<s[0].length;i++){
            StringBuilder sb = new StringBuilder();
            for (int j =0;j<s.length;j++)
                sb.append(ss[j][i]);
            set[i]=sb.toString();
        }
        boolean[]used= new boolean[s[0].length];
        boolean pld=false;
        for (int i =0;i<s[0].length;i++){
            if (used[i])
                continue;
            String rev= (new StringBuilder(set[i]).reverse()).toString();
            for (int j =0;j<set.length;j++){
                if (i!=j&&!used[j]&&rev.equals(set[j])){
                    used[j]=used[i]=true;
                    break;
                }
            }
            if (used[i])
                continue;

            if (set.length%2==0)
                return false;
            else if (!pd(set[i])||pld){
                return false;
            }
            else{
                pld=true;
                used[i]=true;
            }
        }
        return true;
    }
    static boolean pd(String s){
        for (int i =0;i<s.length()/2;i++)
            if (s.charAt(i)!=s.charAt(s.length()-i-1))
                return false;
        return true;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int m = sc.nextInt();
        s= new char[n][m];
        for (int i =0;i<n;i++)s[i]=sc.next().toCharArray();
        HashSet<Integer>hs = new HashSet<>();
        int[]cur = new int[n];
        for (int i =0;i<n;i++)hs.add(i);
        if (n%2==0){
            pw.println(bf(0,cur,hs)?"YES":"NO");
        }
        else {
            for (int i =0;i<n;i++){
                cur[cur.length-1]=i;
                hs.remove(i);
                if (bf(0,cur,hs)){
                    pw.println("YES");
                    pw.flush();
                    return;
                }
                hs.add(i);
            }
            pw.println("NO");
        }
        pw.close();

    }
    static class Scanner {
        BufferedReader br;
        StringTokenizer st;

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

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public int[] nextIntArr(int n) throws IOException {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(next());
            }
            return arr;
        }

    }

}
