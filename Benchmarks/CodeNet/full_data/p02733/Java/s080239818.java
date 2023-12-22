import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        
        // board[i][j]: チョコレートの模様
        char[][] board = new char[h][w];
        for (int i = 0; i < h; i++) {
            String str = sc.next();
            for (int j = 0; j < w; j++) {
                board[i][j] = str.charAt(j);
            }
        }
        
        // bit: 横線の引き方のbit全探索
        // min: cutの最小値
        int min = (h-1)*(w-1);
        for (int bit = 0; bit < 1<<(h-1); bit++) {
            // bit -> group[i]: i行が属するグループ番号
            int[] group = new int[h];
            int g = 0;
            group[0] = g;
            for (int i = 0; i < h-1; i++) {
                // bitXが1なら次のグループにする
                if ((bit & (1<<i)) != 0) {
                    g++;
                }
                group[i+1] = g;
            }
            
            // board -> cut: 縦/横の切れ込みを入れた回数
            int cut = g;
            
            // count[i]: グループiの現在の'1'の個数
            // last: 最後に引いた縦線の位置
            // ok: 1列だけでk個を超すグループが存在しないならtrue
            int[] count = new int[g+1];
            int last = 0;
            boolean ok = true;
            
            // 縦方向に数えていく
            for (int i = 0; i < w; i++) {
                for (int j = 0; j < h; j++) {
                    if (board[j][i] == '1') {
                        count[group[j]]++;
                    }
                        
                    if (count[group[j]] > k) {
                        if (last != i) {
                            cut++;
                            Arrays.fill(count, 0);
                            last = i;
                            i--;
                            break;
                        } else {
                            ok = false;
                        }
                    }
                }
            }
            
            if (ok) {
                min = Math.min(min, cut);
            }
        }
        
        System.out.println(min);
    }
}
