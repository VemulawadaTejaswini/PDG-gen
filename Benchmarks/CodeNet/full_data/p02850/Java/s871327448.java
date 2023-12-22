import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> edges[]=new ArrayList[n];
        long[] pairs=new long[n-1];
        int[] pcol=new int[n];
        for(int i=0;i<n-1;i++){
            int a=sc.nextInt()-1, b=sc.nextInt()-1;
            if(edges[a]==null) edges[a]=new ArrayList<Integer>();
            edges[a].add(b);
            pairs[i]=(long)a*n+b;
        }
        sc.close();
        HashMap<Long, Integer> colors=new HashMap<>();
        int dim=0;
        for(int v=0;v<n;v++){
            if(edges[v]==null) continue;
            int c=0;
            for(int u:edges[v]) colors.put((long)v*n+u, pcol[u]=pcol[v]==++c?++c:c);
            if(c>dim) dim=c;
        }
        System.out.println(dim);
        for(int i=0;i<n-1;i++) System.out.println(colors.get(pairs[i]));
    }
}