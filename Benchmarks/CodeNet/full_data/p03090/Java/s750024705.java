import java.util.*;
import java.io.*;
import static java.lang.System.in;

public class Main {
    static int n,k;
    static long mod = 1000000000+7;
    static long[] fac,inv;
    static int[] id,size;
    //static long mod = 1000000000+7;
    //static HashSet<Integer>[] graph;
    //static ArrayList<Integer>[] rec = new ArrayList[3];
    public static void main(String[] args)throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        //String[] buf = reader.readLine().split(" ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintWriter out = new PrintWriter(System.out);
        HashSet<String> res = new HashSet<>();
        if(n%2==0){
            for(int i=1;i<=n;i++){
                for(int j=1;j<n;j++){
                    if(i==j||i+j==n+1) continue;
                    res.add(getKey(i,j));
                }
            }
        }else{
            for(int i=1;i<n;i++) res.add(getKey(i,n));
            for(int i=1;i<n;i++){
                for(int j=1;j<n;j++){
                    if(i==j||i+j==n) continue;
                    res.add(getKey(i,j));
                }
            }
        }
        out.println(res.size());
        for(String w:res) out.println(w);
        out.flush();
    }
    static String getKey(int i, int j){
        if(i>j){
            int c = i;
            i = j; j = c;
        }
        return Integer.toString(i)+" "+Integer.toString(j);
    }
}