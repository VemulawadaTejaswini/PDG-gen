import java.util.*;

public class Main {
    public static void dfs(int color,int index,int N,Edge[] es,ArrayList<Integer> colors){
       ArrayList<Long> nexts = new ArrayList<>();
       if(colors.get(index) != 100)
           return;
       colors.set(index,color);
       for(Edge e: es){
           if(e == null)
               break;
           if(e.from == index) {
               if (e.weight % 2 == 0)
                   dfs(color, e.to, N, es, colors);
               else
                   dfs(1 - color, e.to, N, es, colors);
           }
           else if(e.to == index){
               if(e.weight % 2 == 0)
                   dfs(color,e.from,N,es,colors);
               else
                   dfs(1 - color,e.from,N,es,colors);
           }
       }
    }

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Edge[] edges = new Edge[N];

        for(int i =0;i < N - 1; i++) {
            int u, v;
            long w;
            u = sc.nextInt();
            v = sc.nextInt();
            w = sc.nextLong();

            Edge e = new Main.Edge(u,v,w);
            edges[i] = e;
        }
        ArrayList<Integer> colors = new ArrayList<>(Collections.nCopies(N + 1,100));
        dfs(1,edges[0].from,N,edges,colors);


        for(int i = 1; i <= N;i++)
            System.out.println(colors.get(i));
    }



  public static class Edge{
        int from;
        int to;
        long weight;

        Edge(int f,int t,long w){
            from = f;
            to = t;
            weight = w;
        }
    }






    public static Integer min(List<Integer> ar){
        int min = 10000;
        int index = 0;
        for(int i = 0; i< ar.size();i++){
            if(min > ar.get(i)){
                min = ar.get(i);
                index = i;
            }
        }
        return min;
    }
}



