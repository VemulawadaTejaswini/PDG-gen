import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;
import java.lang.Math.*;
public class Main {
    static ArrayList<Node>[][] matches;
    static int [][]count;
    static int [][] cost;
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int n = in.nextInt();
        count = new int[n+1][n+1];
        cost = new int[n+1][n+1];
        matches = new ArrayList[n+1][n+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++)
                matches[i][j] = new ArrayList<Node>();
        }
        for(int i=1;i<=n;i++){
            int next = in.nextInt();
            int pmin = Math.min(i,next);
            int pmax = Math.max(i,next);
            for(int j=1;j<n-1;j++){
                next = in.nextInt();
                int mn = Math.min(i,next);
                int mx = Math.max(i,next);
                count[mn][mx] +=1;
                matches[pmin][pmax].add(new Node(mn,mx));
                pmin = mn;pmax=mx;
            }
        }
        LinkedList<Node> queue = new LinkedList<>();
        for(int i=1;i<n;i++){
            for(int j=i+1;j<=n;j++) {
                if(matches[i][j].size()>0 && count[i][j]==0){
                    queue.addLast(new Node(i,j));
                }
            }
        }
        while (queue.size()>0){
            Node next = queue.removeFirst();
            for(Node v:matches[next.l][next.h]){
                dfs(v,0);
            }
        }
        int day =0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(count[i][j]>0){
                    System.out.println(-1);
                    return;
                }
                day=Math.max(day,cost[i][j]);
            }
        }
        System.out.println(day+1);
    }
    static public class Node{
        int l;int h;
        public Node(int a,int b){
            l=a;h=b;
        }
    }
    static void dfs(Node vertice , int v){
        int curCost = 1+v;
        cost[vertice.l][vertice.h]= Math.max(curCost,cost[vertice.l][vertice.h]);
        count[vertice.l][vertice.h]--;
        if (count[vertice.l][vertice.h]==0 && matches[vertice.l][vertice.h].size()>0){
            for(Node value:matches[vertice.l][vertice.h]){
                dfs(value,cost[vertice.l][vertice.h]);
            }
        }
    }

}
