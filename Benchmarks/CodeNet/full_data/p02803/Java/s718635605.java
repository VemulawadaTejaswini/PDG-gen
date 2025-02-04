import java.util.*;
public class Main {
    static int h,w;
    static int[][] directions={{1,0},{-1,0},{0,1},{0,-1}};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        w = sc.nextInt();
        char[][] graph = new char[h][w];
       for(int i=0;i<h;i++)
       {
           graph[i]=sc.next().toCharArray();
       }
        int res=0;
        for(int i=0;i<h*w;i++)
           {
                res=Math.max(res,bfs(i,graph));
                //System.out.println(bfs(0));
            }
        System.out.println(res);
    }
    public static int bfs(int start, char[][] graph)
    {
        int x=start/w;
        int y=start%w;

        Queue<int[]>queue=new LinkedList<>();
        queue.offer(new int[]{x,y});
        boolean[][] visited=new boolean[h][w];
        int step=-1;
        while(queue.size()>0){
            int s=queue.size();
            while(s-->0)
            {
                int[] cell=queue.poll();
                int curx=cell[0];
                int cury=cell[1];
                visited[curx][cury]=true;
                for(int[] direction:directions)
                {
                    int nextx=curx+direction[0];
                    int nexty=cury+direction[1];
                    if(nextx<0||nexty<0||nextx>=h||nexty>=w||visited[nextx][nexty]||graph[nextx][nexty]=='#')
                    {continue;}
                    queue.offer(new int[]{nextx,nexty});
                }
            }
            step++;
        }
        return step;
    }
}
