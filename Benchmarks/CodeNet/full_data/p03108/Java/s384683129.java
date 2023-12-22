import java.util.*;
import java.io.*;
import static java.lang.System.in;

public class Main {
    static int[] id;
    static long[] size;
    static int[][] edge;
    static long toSubtract;
    public static void main(String[] args)throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        toSubtract = n;
        id = new int[n+1];
        edge = new int[m][];
        for(int i=0;i<m;i++){
            edge[i] = new int[]{sc.nextInt(),sc.nextInt()};
        }
        id = new int[n+1]; size = new long[n+1];
        for(int i=0;i<=n;i++) id[i]=i;
        Arrays.fill(size,1);
        long base = ((long)n)*((long)n);
        ArrayList<Long> res = new ArrayList<>();
        res.add((base-toSubtract)/2);
        PrintWriter out = new PrintWriter(System.out);
        for(int j=m-1;j>=1;j--){
            union(edge[j][0],edge[j][1]);
            res.add((base-toSubtract)/2);
        }
        for(int i=res.size()-1;i>=0;i--) out.println(res.get(i));
        out.flush();
    }
    static int find(int p){
        while(p!=id[p]){
            id[p] = id[id[p]];
            p = id[p];
        }
        return p;
    }
    static void union(int p, int q){
        int i=find(p), j=find(q);
        if(i==j) return;
        id[j] = i;
        toSubtract -= size[i]*size[i]+size[j]*size[j];
        size[i] += size[j];
        toSubtract += size[i]*size[i];
    }
}