import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    static int[] id;
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        boolean[] used = new boolean[M+1];
        id = new int[M+1];
        for(int i=0;i<=M;i++) id[i]=i;
        int l0 = 0;
        for(int i=0;i<N;i++){
            int k = sc.nextInt();
            l0 = sc.nextInt();
            used[l0] = true;
            for(int j=1;j<k;j++){
                int lj = sc.nextInt();
                used[lj]=true;
                union(lj,l0);
            }
        }
        int root = find(l0);
        boolean ans = true;
        for(int i=1;i<=M;i++){
            if(!used[i]) continue;
            ans &= find(i)==root;
        }
        String res = ans?"YES":"NO";
        System.out.println(res);
    }
    static int find(int p){
        while(id[p]!=p){
            id[p] = id[id[p]];
            p = id[p];
        }
        return id[p];
    }
    static void union(int p, int q){
        int i=find(p), j=find(q);
        if(i==j) return;
        id[j]=i;
    }
}
