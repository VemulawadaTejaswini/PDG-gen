import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

public class main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static String line;
    public static StringTokenizer st;
    public static ArrayList<ArrayList<Integer>> adjList;
    public static int[] dx = {-1, 0, 1, 0, -1, 1, 1, -1};
    public static int[] dy = {0, 1, 0, -1, 1, 1, -1, -1};
    public static int INF = 0x3f3f3f3f;
    public static long LINF = 0x3f3f3f3f3f3f3f3fL;
    public static int MOD = 1000000007;

    public static void main(String[] args) throws Exception{
        String s = br.readLine();
        TreeSet<Character> d = new TreeSet<Character>();
        for(int i = 0; i < s.length(); i++){
            d.add(s.charAt(i));
        }

        int best = INF;
        if(d.size() == 1){
            best = 0;
        }
        for(Character t : d){
            boolean f = true;
            char[] A = s.toCharArray();
            int ans = 0;
            while(f){
                f = false;
                char[] B = new char[A.length-1];
                for(int i = 0; i < B.length; i++){
                    if(A[i] == t || A[i+1] == t){
                        B[i] = t;
                    } else{
                        B[i] = A[i];
                        f = true;
                    }
                }
                ans++;
                A = B;
            }
            best = Math.min(best, ans);
        }
        pw.print(best + "\n");
        
        pw.close(); 
        br.close();
    }
}