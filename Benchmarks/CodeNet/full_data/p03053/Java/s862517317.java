import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] s = stdR.readLine().split(" ");
        int H = Integer.parseInt(s[0]);
        int W = Integer.parseInt(s[1]);
        boolean [][] cr = new boolean[H][W];
        int count = 0;
        Queue<String> q = new LinkedList<String>();
        for(int i = 0 ; i < H ; i++) {
            String str = stdR.readLine();
            for(int j = 0 ; j < W ; j++) {
                if(str.charAt(j) == '#') {
                    cr[i][j] = true;
                    count++;
                    q.add(j+","+i+","+0);
                }
            }
        }
        int max = 0;
        while(true) {
            String[] st = q.poll().split(",");
            int nx = Integer.parseInt(st[0]);
            int ny = Integer.parseInt(st[1]);
            int nturn = Integer.parseInt(st[2]);
            if(nx - 1 >= 0 && !cr[ny][nx - 1]) {
                cr[ny][nx - 1] = true;
                q.add((nx - 1)+","+ny+","+(nturn + 1));
                count++;
                max = Math.max(max, nturn + 1);
            }
            if(ny - 1 >= 0 && !cr[ny - 1][nx]) {
                cr[ny - 1][nx] = true;
                q.add(nx+","+(ny - 1)+","+(nturn + 1));
                count++;
                max = Math.max(max, nturn + 1);
            }
            if(nx + 1 < W && !cr[ny][nx + 1]) {
                cr[ny][nx + 1] = true;
                q.add((nx + 1)+","+ny+","+(nturn + 1));
                count++;
                max = Math.max(max, nturn + 1);
            }
            if(ny + 1 < H && !cr[ny + 1][nx]) {
                cr[ny + 1][nx] = true;
                q.add(nx+","+(ny + 1)+","+(nturn + 1));
                count++;
                max = Math.max(max, nturn + 1);
            }
            if(count == H * W)break;
        }
        System.out.println(max);
    }
}
