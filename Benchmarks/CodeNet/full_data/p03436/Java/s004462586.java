import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {Main instance = new Main();sc = instance.new Scanner();instance.solve();}
    private class Scanner {String[] s = new String[0];String regex = " ";int i = 0;BufferedReader br = new BufferedReader(new InputStreamReader(System.in));public String next() {try {if (i < s.length) { return s[i++];}String st = br.readLine();while ("".equals(st)) { st = br.readLine(); }s = st.split(regex, 0);i = 0;return s[i++];} catch (IOException e) { return null; }}public int nextInt(){return Integer.parseInt(next());}}        
    private static Scanner sc;

    private void solve() {
        int H = sc.nextInt();
        int W = sc.nextInt();
        String[][] s = new String[H][W];
        for (int i = 0; i < H; i++) {
            s[i] = sc.next().split("");
        }
        
        // 幅優先探索
        int startX = 0, startY = 0, goalX = W-1, goalY = H-1;
        Deque<Integer> qx = new ArrayDeque<>();
        Deque<Integer> qy = new ArrayDeque<>();
        qx.add(startX); qy.add(startY);
        int[][] check = new int[H][W];
        int[] dirx = {0, 0, -1, 1}, diry = {-1, 1, 0, 0};
        check[startY][startX] = 1;
        while(qx.size()>0){
            int x = qx.poll(); int y = qy.poll();
            for (int i = 0; i < 4; i++) {
                int x1 = x + dirx[i], y1 = y + diry[i];
                if (0 <= x1 && x1 < W && 0 <= y1 && y1 < H) {
                    if (".".equals(s[y1][x1]) && check[y1][x1] == 0){
                        check[y1][x1] = check[y][x] + 1;
                        qx.add(x1); qy.add(y1);
                    }
                }
            }
            if (x == goalX && y == goalY){
                break;
            }
        }
        int result;
        if(check[goalY][goalX] == 0){
            result = -1;
        } else {
            result = check[goalY][goalX] - 1;
        }
        
        if (result == -1){
            System.out.println(-1);
        } else {
            int sharp = 0;
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if ("#".equals(s[i][j])) {
                        sharp += 1;
                    }
                }
            }
            System.out.println(H*W - (result+1) - sharp);
        }
    }
}