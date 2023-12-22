import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] map = new char[n][];
        for(int i = 0; i < n; i++){
            map[i] = sc.next().toCharArray();
        }
        int ans = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                for(int k = 0; k < n; k++){
                    for(int l = 0; l < m; l++){
                        Boolean[] bool = new Boolean[n*m];
                        Arrays.fill(bool,false);
                        if(map[i][j] == '.' && map[k][l] == '.' && !(i == k && j == l)){
                            ans = Math.max(ans,dfs(n,m,map,i,j,k,l,0,bool));
                        }
                    }
                }
            }
        }
        System.out.println(ans);
        //solve(n,m,0,0,n-1,m-1,map);
    }

    public static int dfs(int n, int m, char[][]map,int sy,int sx,int gy, int gx, int cnt,Boolean[] bool){
        int[] mx = {1,0,-1,0};
        int[] my = {0,1,0,-1};
        if(sy == gy && sx == gx){
            return cnt;
        }
        int ret = 100000000;
        for(int i = 0; i < 4; i++){
            if(!(0 <= sy+my[i] && sy+my[i] < n && 0 <= sx+mx[i] && sx+mx[i] < m)){
                continue;
            }else if(map[sy+my[i]][sx+mx[i]] == '#' || bool[(sy+my[i])*m+sx+mx[i]]){
                continue;
            }
            bool[(sy+my[i])*m+sx+mx[i]] = true;
            ret = Math.min(ret,dfs(n,m,map,sy+my[i],sx+mx[i],gy,gx,cnt+1,bool));
            bool[(sy+my[i])*m+sx+mx[i]] = false;
        }
        return ret;
    }
/*
    void solve (int h, int w, int sy,int sx, int gy, int gx, char[][] map) {
                int[] mx = [1,0,-1,0];
        int[] my = [0,1,0,-1];
        int[] mx = [1,0,-1,0];
        int[] my = [0,1,0,-1];
        Point start = new Point(sx, sy), goal = new Point(gx, gy);
        ArrayDeque<Point> dq = new ArrayDeque<>();
        dq.add(start);
        int[][] moves = new int[h][w];
        map[start.getY()][start.getX()] = '#';
        while (dq.size() > 0) {
            Point p = dq.removeFirst();
            for (int i=0; i<4; i++) {
                int x = p.getX()+mx[i].getX();
                int y = p.getY()+my[i].getY();
                check
                if (map[y][x] == '.') {
                    dq.addLast(new Point(x, y));
                    map[y][x] = '#';
                    moves[y][x] = moves[p.getY()][p.getX()] + 1;
                }
            }
        }
        System.out.println(moves[goal.getY()][goal.getX()]);
    }
    */
}
/*
class Point{
    int x;
    int y;
    public void Point(x,y){
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return this.x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getX(){
        return this.y;
    }

    public int getX(){
        this.y = y;
    }
}
*/