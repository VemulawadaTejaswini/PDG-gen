import java.util.Scanner;
import java.util.Vector;

public class Main {
    final  static int max=1000010;
    static class Pair{
        int  f ;
        long s;
        Pair(int a,long b){
            f=a;
            s=b;
        }
    }

    static Vector<Pair> edge[]= new Vector[max * 2];
    static long res[]=new long[max*2];

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int cases=in.nextInt();
        while(--cases!=0) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            if(edge[a]==null)
                edge[a]=new Vector<>();
            edge[a].add(new Pair(b, c));

            if(edge[b]==null)
                edge[b]=new Vector<>();
            edge[b].add(new Pair(a, c));

        }

        int n=in.nextInt(),k=in.nextInt();
        DFS(k,0);
        while (n--!=0){
            int  f=in.nextInt();
            int  t=in.nextInt();

            System.out.println(res[f]+res[t]);
        }

    }

    static boolean visited[]=new boolean[max*2];
    private static void DFS(int k, long e) {
        visited[k]=true;
        for(int i=0;i<edge[k].size();i++)
        {
            if(!visited[edge[k].get(i).f])
            {
               res[edge[k].get(i).f]=e+edge[k].get(i).s;
               DFS(edge[k].get(i).f,e+edge[k].get(i).s);
            }

        }
    }
}
