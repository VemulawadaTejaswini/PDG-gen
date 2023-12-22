import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.stream.IntStream;

class Main{

    static int[] uf;
    static int root(int v){
        if(uf[v]<0)return v;
        return uf[v]=root(uf[v]);
    }
    static int size(int v){
        return -uf[root(v)];
    }
    static void union(int u,int v){
        u = root(u);
        v = root(v);
        if(u==v)return;
        if(size(u)<size(v)){
            int tmp = u;
            u=v;
            v=tmp;
        }
        uf[u]+=uf[v];
        uf[v]=u;
    }
    static boolean same(int u,int v){
        return root(u)==root(v);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int F = N - M;
        int T = (F-1)*2;
        if(T>N){
            System.out.println("Impossible");
            return;
        }
        if(N==M+1){
            System.out.println(0);
            return;
        }
        class Node{
            int a,i;
            Node(int a,int i){
                this.a = a;
                this.i =i;
            }
        }
        int[] a = new int[N];
        for(int i=0;i<N;++i)a[i] = scan.nextInt();

        uf = new int[N];
        Arrays.fill(uf,-1);

        while(M-->0){
            int x = scan.nextInt();
            int y = scan.nextInt();
            union(x,y);
        }

        Map<Integer, PriorityQueue<Integer> > queMap = new HashMap<>();
        for(int i=0;i<N;++i){
            if(!queMap.containsKey(root(i))){
                queMap.put(root(i), new PriorityQueue<>());
            }
                queMap.get(root(i)).add(a[i]);
        }
        int res = 0;

        PriorityQueue<Integer> que = new PriorityQueue<>();
        for(Map.Entry<Integer, PriorityQueue<Integer> > entry : queMap.entrySet()){
            res += entry.getValue().poll();
            --T;
            while(!entry.getValue().isEmpty())que.add(entry.getValue().poll());
        }
        while(T-->0)res+=que.poll();
        System.out.println(res);

    }
}