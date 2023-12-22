import java.io.*;
import java.util.*;
import java.math.*;

class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static String line;
    public static StringTokenizer st;
    public static ArrayList<ArrayList<Integer>> adjList;
    public static int[] dx = {-1, 0, 1, 0, -1, 1, 1, -1};
    public static int[] dy = {0, 1, 0, -1, 1, 1, -1, -1};
    public static int INF = 0x3f3f3f3f;
    public static int MOD = 1000000007;

    public static void main(String[] args) throws Exception{
        // int min = INF;
        // int n = 101;
        // for(int i = 1; i <= 10000; i++){
        //     String s1 = String.valueOf(n * i);
        //     int total = 0;
        //     for(int j = 0; j < s1.length(); j++){
        //         total += s1.charAt(j) - '0';
        //     }
        //     min = Math.min(min, total);
        //     System.out.println(n * i + " " + total);
        // }
        // System.out.println(min);
        int N = Integer.parseInt(br.readLine());

        while(N % 2 == 0){
            N /= 2;
        }
        while(N % 5 == 0){
            N /= 5;
        }

        long ans = INF;
        for(int i = 1; i <= 1e7; i++){
            long n = i * (long) N;
            String s = String.valueOf(n);
            long total = 0;
            for(int j = 0; j < s.length(); j++){
                total += s.charAt(j) - '0';
            }
            ans = Math.min(ans, total);
        }
        pw.print(ans + "\n");

        pw.close(); 
        br.close();
    }
}

class Pair implements Comparable<Pair>{
    public int x, y;

    Pair(int _x, int _y){
        x = _x;
        y = _y;
    }

    public String toString(){
        return x + "," + y;
    }

    public int compareTo(Pair p){
        if(x != p.x) return x < p.x ? 1 : -1;
        else if(y != p.y) return y < p.y ? -1 : 1;
        return 0;
    }
}