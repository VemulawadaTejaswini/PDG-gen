import java.io.*;
import java.util.*;

/**
 * @author baito
 */
class UnionFindTree
{
    int[] par;
    int[] rank;
    long[] sizes;

    UnionFindTree(int n)
    {
        par = new int[n];
        rank = new int[n];
        sizes = new long[n];
        for (int i = 0; i < n; i++)
        {
            par[i] = i;
            sizes[i] = 1;
        }
    }

    int root(int x)
    {
        if (par[x] == x) return x;
        else return par[x] = root(par[x]);
    }

    void unite(int x, int y)
    {
        x = root(x);
        y = root(y);

        if (x == y) return;
        if (rank[x] < rank[y])
        {
            par[x] = y;
            sizes[y] += sizes[x];
        }
        else
        {
            par[y] = x;
            sizes[x] += sizes[y];
            if (rank[x] == rank[y]) rank[x]++;
        }
    }

    boolean isSame(int x, int y)
    {
        return root(x) == root(y);
    }

    long size(int x)
    {
        return sizes[par[x]];
    }
}

public class Main
{
    static StringBuilder sb = new StringBuilder();
    static Scanner sc = new Scanner(System.in);
    static int INF = 12345678;
    static long LINF = 123456789123456789L;
    static long MINF = -123456789123456789L;
    static long MOD = 1000000007;
    static int[] y4 = {0, 1, 0, -1};
    static int[] x4 = {1, 0, -1, 0};
    static int[] y8 = {0, 1, 0, -1, -1, 1, 1, -1};
    static int[] x8 = {1, 0, -1, 0, 1, -1, 1, -1};
    static long[] F;//factorial
    static boolean[] isPrime;
    static int[] primes;
    static char[][] map;

    static int N, M;
    static long[][] costs;


    public static void main(String[] args)
    {
        N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N;i++){
            A[i] = sc.nextInt();
        }
        int[] where  = new int[N + 1];
        //注意　１から始まる
        //[N]はNが入ってる一のインデックス
        for(int i = 0; i < N ; i++){
            where[A[i]] = i;
        }
        
        UnionFindTree uni = new UnionFindTree(N+1);
        boolean[] usedIndex = new boolean[N];
        long sum = 0;
        for(int i = N ; i > 0; i--){
            int index = where[i];//indexは0から
            long res = i;
            if(index - 1 >= 0 && usedIndex[index-1]){
                res *= (long)uni.size(A[index-1]) + 1;
                uni.unite(A[index],A[index-1]);
            }
            if(index + 1 < N && usedIndex[index+1]){
                res *= (long)uni.size(A[index+1]) + 1;
                uni.unite(A[index],A[index+1]);
            } 
            usedIndex[index] = true;
            sum += res;
        }
        System.out.println(sum);
    }
}