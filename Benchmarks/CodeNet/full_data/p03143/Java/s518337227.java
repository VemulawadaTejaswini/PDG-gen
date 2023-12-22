import java.io.*;
import  java.util.*;

import static java.lang.System.in;

class Main{
    static long[] X,sum;
    static Edge[] edges;
    static int[] id,unconnected;
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        sum = new long[n+1];
        edges = new Edge[m];
        id = new int[n+1];
        unconnected = new int[n+1];

        for(int i=1;i<=n;i++) {
            sum[i] = sc.nextLong();
            id[i] = i;
        }
        for(int i=0;i<m;i++){
            int a = sc.nextInt(), b = sc.nextInt();
            long y = sc.nextLong();
            edges[i] = new Edge(a,b,y);
        }
        Arrays.sort(edges);
        for(int i=0;i<m;i++){
            Edge e = edges[i];
            union(e.left,e.right,e.weight);
        }
        int ans = unconnected[find(1)];
        System.out.println(ans);
    }
    static int find(int p){
        while(p!=id[p]){
            id[p] = id[id[p]];
            p = id[p];
        }
        return p;
    }
    static void union(int p, int q, long Y){
        int i = find(p), j = find(q);
        if(i==j){
            if(Y>sum[i]) unconnected[i]++;
        } else{
            if(Y<=sum[i]+sum[j]) unconnected[i]=0;
            else unconnected[i]+=1+unconnected[j];
            sum[i] += sum[j];
            id[j] = i;
        }
    }
    static class Edge implements Comparable<Edge>{
        int left, right;
        long weight;
        public Edge(int l, int r, long w){
            this.left = l; this.right = r;
            this.weight = w;
        }
        public int compareTo(Edge e){
            return Long.compare(this.weight,e.weight);
        }
    }
}
