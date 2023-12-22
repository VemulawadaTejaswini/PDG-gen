import java.util.*;

public class Main {
    private static int W;
    private static int H;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        int[][] s = new int[H + 2][W + 2];
        int count = 0;
        for (int row = 1; row <= H; row++) {
            String cur = sc.next();
            for (int col = 1; col <= W; col++) {
                char temp = cur.charAt(col - 1);
                if (temp == '.') {
                    s[row][col] = 1;
                    count++;
                }
            }
        }
        /*
        boolean[] record = new boolean[(H + 2) * (W + 2)];
        record[W + 3] = true;
        int r1 = dfs(s, 1, 1, 2, record);
        int r2 = dfs(s, 1, 2, 1, record);
        int ans;
        if (r1 == -1 && r2 == -1) ans = -1;
        else {
            int min = Integer.MAX_VALUE;
            if (r1 != -1) min = Math.min(min, r1);
            if (r2 != -1) min = Math.min(min, r2);
            ans = count - min;
        }*/
        int res = bfs(s);
        if (res == -1) System.out.println(-1);
        else System.out.println(count - res);
    }

    /*private static int dfs(int[][] m, int level, int row, int col, boolean[] record){
         if(m[row][col]==0) return -1;
         if(record[col+row*(W+2)]) return -1;
         if(row==H&&col==W) return level+1;
         boolean[] newRecord = new boolean[record.length];
         System.arraycopy(record,0,newRecord,0,record.length);
         newRecord[col+row*(W+2)] = true;
         int r1=dfs(m,level+1,row-1,col,newRecord);
         int r2=dfs(m,level+1,row+1,col,newRecord);
         int r3=dfs(m,level+1,row,col-1,newRecord);
         int r4=dfs(m,level+1,row,col+1,newRecord);
         int min = Integer.MAX_VALUE;
         int[] res = new int[]{r1,r2,r3,r4};
         for(int i=0;i<4;i++){
             if(res[i]==-1) continue;
             min = Math.min(min,res[i]);
         }
         if(min==Integer.MAX_VALUE) return -1;
         else return min;
    }*/
    static int bfs(int[][] s) {
        boolean[][] record = new boolean[H + 2][W + 2];

        int count = 1;
        LinkedList<int[]> cur = new LinkedList<>();
        LinkedList<int[]> next = new LinkedList<>();
        cur.add(new int[]{1, 1});
        while (cur.size() > 0) {
            int[] now = cur.remove();
            if (now[0] == H && now[1] == W) return count;
            if ((!record[now[0]][now[1]]) && s[now[0]][now[1]] != 0) {
                record[now[0]][now[1]] = true;
                next.add(new int[]{now[0] - 1, now[1]});
                next.add(new int[]{now[0] + 1, now[1]});
                next.add(new int[]{now[0], now[1] - 1});
                next.add(new int[]{now[0], now[1] + 1});
            }
            if (cur.size() == 0) {
                count++;
                cur = next;
                next = new LinkedList<>();
            }

        }
        return -1;
    }
}