import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static int n,m;
    static ArrayList<Point>[] adj;
    static boolean[] vis;
    static boolean desOk;

    public static int dfs(int src, int des){
        vis[src] = true;
        if(src == des){
            desOk = true;
            return 0;
        }
        int sum = 0;
        for(Point ch : adj[src]){
            if(vis[ch.x])
                continue;
            sum += ch.y + dfs(ch.x, des);
        }
        return desOk? sum:-1;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        boolean ok = true;
        n = in.nextInt();
        m = in.nextInt();
        adj = new ArrayList[n+1];
        for(int i=0; i<n+1; i++)
            adj[i] = new ArrayList<Point>();

        for(int i=0; i<m; i++){
            int l = in.nextInt(),r = in.nextInt(),d = in.nextInt();
            vis = new boolean[n+1];
            desOk = false;
            int currD = dfs(l,r);
            if(currD != d && currD != -1){
                //System.out.println(l+" "+r+" "+d+" "+currD);
                ok = false;
            }else{
                adj[l].add(new Point(r,d));
                adj[r].add(new Point(l,d));
            }
        }

        System.out.println(ok? "Yes":"No");


    }
}