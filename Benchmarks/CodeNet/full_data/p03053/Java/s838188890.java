import java.util.*;

public class Main {

    static int[][] dir = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        boolean[][] a = new boolean[h][w];
        ArrayDeque<int[]> deq = new ArrayDeque<>();
        for (int i = 0; i < h; i++) {
            char[] s = sc.next().toCharArray();
            for (int j = 0; j < w; j++) {
                if(s[j] == '#') {
                    a[i][j] = true;
                    deq.add(new int[]{i, j});
                }
            }
        }
        boolean changed = true;
        int cnt = 0;
        while(changed){
            changed = false;
            ArrayDeque<int[]> nextDeq = new ArrayDeque<>();
            while(!deq.isEmpty()){
                int[] b = deq.poll();
                for(int[] d : dir){
                    int x = b[0] + d[0];
                    int y = b[1] + d[1];
                    if(x < 0 || h -1 < x || y < 0 || w -1 < y) continue;
                    if(a[x][y]) continue;
                    a[x][y] = true;
                    changed = true;
                    nextDeq.add(new int[]{x, y});
                }
            }
            if(changed) cnt++;
            deq = nextDeq;
        }
        System.out.println(cnt);
        sc.close();
    }

}
