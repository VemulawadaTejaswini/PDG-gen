import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Main{
    static List<Integer> edges[];
    static int white[];
    static boolean nibu=true;
    static void bfs(int v, int c){
        if(white[v]>=0){
            if(c%2!=white[v])nibu=false;
            return;
        }
        white[v]=c;
        for(int u :edges[v])bfs(u, (c+1)%2);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        boolean[][] edge = new boolean[N][N];
        while(M-->0){
            int a = scan.nextInt()-1;
            int b = scan.nextInt()-1;
            edge[a][b]=edge[b][a]=true;
        }
        edges = new ArrayList[N];
        white = new int[N];
        Arrays.fill(white, -1);
        for(int i=0;i<N;++i)edges[i]=new ArrayList<>();
        int root = -1;
        for(int i=0;i<N;++i)for(int j=i+1;j<N;++j)if(!edge[i][j]){
            edges[i].add(j);
            edges[j].add(i);
            if(root<0)root=i;
        }
        if(root>=0)bfs(root, 0);
        if(!nibu){
            System.out.println(-1);
        }else{
            int amari = 0;
            int left=0;
            for(int i=0;i<N;++i){
                if(white[i]<0)++amari;
                if(white[i]==0)++left;
            }
            int right = N-(left+amari);
            while(amari-->0){
                if(left<right)++left;
                else ++right;
            }
            System.out.println((left*(left-1))/2 + (right*(right-1)/2));
        }
    }
}