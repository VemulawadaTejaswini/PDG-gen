import java.io.*;
import java.util.*;

public class Main{
    PrintWriter out = new PrintWriter(System.out);
    int ans = 1, H, W;
    char[][] maze;
    int[] dr = new int[]{1,0,-1,0}, dc = new int[]{0,1,0,-1};
    static public void main(String[] args) throws Exception{
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] buf = reader.readLine().split(" ")
        Main main = new Main();
        main.solve();
//        System.out.println(main.solve());
    }
    int solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<int[]> pq = new PriorityQueue<>(n,(e1,e2)->(e1[1]-e2[1]));
        for(int i=1;i<=n;i++){
            int a = sc.nextInt();
            pq.add(new int[]{i,a});
        }
        while(pq.size()>0){
            int[] now = pq.poll();
            out.print(now[0]);
            out.print(' ');
        }
        out.flush();
        int ans = 0;
        return ans;
    }

}

