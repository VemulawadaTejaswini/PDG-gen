import java.io.*;
import  java.util.*;

import static java.lang.System.in;

class Main{
    static int n;
    static long[] x,c,v,sum;
    static long[][] f;
    static long[] dp;
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), K = sc.nextInt();
        PriorityQueue<Sushi> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            int t = sc.nextInt(), d = sc.nextInt();
            pq.add(new Sushi(t,d));
        }
        PriorityQueue<Integer> outCan = new PriorityQueue<>();
        long sum = 0;
        int[] used = new int[n+1];
        int kinds = 0;
        for(int i=0;i<K;i++){
            Sushi cur = pq.poll();
            if(used[cur.type]==0) kinds++;
            else outCan.add(cur.deli);
            used[cur.type]++;
            sum += cur.deli;
        }
        long ans = sum + ((long)Math.pow(kinds,2));
        while(kinds<=K&&pq.size()>0&&outCan.size()>0){
            Sushi cur = pq.poll();
            if(used[cur.type]>0) continue;
            used[cur.type]++;
            sum -= outCan.poll();
            sum += cur.deli;
            kinds++;
            ans = Math.max(ans,sum+((long)Math.pow(kinds,2)));
        }
        System.out.println(ans);
    }
    static class Sushi implements Comparable<Sushi>{
        int type, deli;
        public Sushi(int t, int d){this.type=t; this.deli=d;}
        public int compareTo(Sushi o){
            return o.deli-this.deli;
        }
    }
}
