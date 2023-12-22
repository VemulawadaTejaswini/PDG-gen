import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
         
        // H*Wのマス目
        int H = sc.nextInt();
        int W = sc.nextInt();
        
        // マス目のデータ(input)
        String[] str_HW = new String[H];
        for (int i = 0; i < str_HW.length; i++){
            str_HW[i] = sc.next();
        }
        
        int[] dx = {1, 0, -1, 0, 1, -1, -1, 1};
        int[] dy = {0, 1, 0, -1, 1, 1, -1, -1};
        
        // マス目のテーブル(input)
        // １文字ずつ分解
        String [][] tbl = new String[H][W];
        for(int i = 0; i<tbl.length; i++){
            for(int j = 0; j<tbl[0].length; j++){
                tbl[i][j] = String.valueOf(str_HW[i].charAt(j));
            }
        }
       
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                // 基準マスが爆弾の場合、抜ける
                if (tbl[i][j].equals("#")) {
                    continue;
                }
                
                int num = 0;
                for (int d = 0; d < 8; ++ d) {
                    int ni = i + dy[d]; // h
                    int nj = j + dx[d]; // w
                    
                    // 基準から１つ移動したマスの縦軸がマイナスかマスの最大以上の場合、チェック対象外
                    if (ni < 0 || H <= ni) { 
                        continue;
                    }
                    
                    // 基準から１つ移動したマスの横軸がマイナスかマスの最大以上の場合、チェック対象外
                    if (nj < 0 || W <= nj) {
                        continue;
                    }
                    
                    // 基準から１つ移動したマスが有効かつ爆弾の場合、カウントアップ
                    if (tbl[ni][nj].equals("#")) {
                        num++;
                    }
                    
                    // カウント結果で上書き
                    tbl[i][j] = String.valueOf(num + 0);
                 }
            }
        }
      
        for (int i = 0; i < H; i++) {  
          for (int j = 0; j < W; j++){
            System.out.print(tbl[i][j]);
          }
          System.out.println();
        }
    }
}
