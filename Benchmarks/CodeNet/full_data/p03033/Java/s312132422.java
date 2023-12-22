import java.io.*;
import java.util.*;


public class Main {
    static long mod = 1000000000+7;
    static int maxn=2;
    static long[] f5ac, inv;
    static ArrayList<Integer>[] rec;
    static int[] v;
    static int n,q;
    public static void main(String[] args) throws Exception {
        //Scanner sc = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] buf = reader.readLine().split(" ");
        n = Integer.parseInt(buf[0]); q = Integer.parseInt(buf[1]);
        TreeMap<Integer,Integer> valIdx = new TreeMap<>();
        int[] D = new int[q];
        block[] rec = new block[n];
        for(int i=0;i<n;i++){
            buf = reader.readLine().split(" ");
            int s = Integer.parseInt(buf[0]), t = Integer.parseInt(buf[1]), x = Integer.parseInt(buf[2]);
            rec[i] = new block(s,t,x);
        }
        for(int i=0;i<q;i++){
            buf = reader.readLine().split(" ");
            D[i] = Integer.parseInt(buf[0]);
            valIdx.put(D[i],i);
        }
        Arrays.sort(rec,(a,b)->(a.x-b.x)); // let the ones with smaller x come first
        // check for every block
        int inf = Integer.MAX_VALUE/2;
        int[] res = new int[q];
        Arrays.fill(res,inf);
        for(int i=0;i<n;i++){
            block cur = rec[i];
            Integer left = valIdx.ceilingKey(cur.s-cur.x);
            Integer right = valIdx.lowerKey(cur.t-cur.x);
            if(left==null||right==null||left>right) continue; // no person affected
            int riBound = right;
            while(left!=null&&left<=riBound){
                int pos = valIdx.get(left);
                res[pos] = cur.x;
                valIdx.remove(left);
                left = valIdx.ceilingKey(cur.s-cur.x);
            }
        }
        PrintWriter out = new PrintWriter(System.out);
        for(int i=0;i<q;i++){
            if(res[i]==inf) out.println(-1);
            else out.println(res[i]);
        }
        out.flush();
    }
    static class block{
        int s, t, x;
        public block(int st, int te, int pos){
            this.s = st; this.t = te; this.x = pos;
        }
    }
}

