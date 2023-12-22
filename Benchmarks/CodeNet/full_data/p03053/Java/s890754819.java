import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] s = stdR.readLine().split(" ");
        int H = Integer.parseInt(s[0]);
        int W = Integer.parseInt(s[1]);
        char [][] cr = new char[H][W];
        for(int i = 0 ; i < H ; i++) {
            String str = stdR.readLine();
            for(int j = 0 ; j < W ; j++) {
                cr[i][j] = str.charAt(j);
            }
        }
        int count = 0;
        Queue<String> q = new LinkedList<String>();
        for(int i = 0 ; i < H ; i++) {
            for(int j = 0 ; j < W ; j++) {
                if(cr[i][j] == '#') {
                    count++;
                    q.add(j+","+i+","+0);
                }
            }
        }
        while(true) {
            String[] st = q.poll().split(",");
            int nx = Integer.parseInt(st[0]);
            int ny = Integer.parseInt(st[1]);
            int nturn = Integer.parseInt(st[2]);
            if(nx - 1 >= 0 && cr[ny][nx - 1] == '.') {
                cr[ny][nx - 1] = '#';
                q.add((nx - 1)+","+ny+","+(nturn + 1));
                count++;
            }
            if(ny - 1 >= 0 && cr[ny - 1][nx] == '.') {
                cr[ny - 1][nx] = '#';
                q.add(nx+","+(ny - 1)+","+(nturn + 1));
                count++;
            }
            if(nx + 1 < W && cr[ny][nx + 1] == '.') {
                cr[ny][nx + 1] = '#';
                q.add((nx + 1)+","+ny+","+(nturn + 1));
                count++;
            }
            if(ny + 1 < H && cr[ny + 1][nx] == '.') {
                cr[ny + 1][nx] = '#';
                q.add(nx+","+(ny + 1)+","+(nturn + 1));
                count++;
            }
            if(count == H * W)break;
        }
        int max = 0;
        while(!q.isEmpty()) {
            max = Math.max(max, Integer.parseInt(q.poll().split(",")[2]));
        }
        System.out.println(max);
    }
}
