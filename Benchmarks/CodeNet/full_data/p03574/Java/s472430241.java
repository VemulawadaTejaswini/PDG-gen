import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
         
        // H*Wのマス目
        int H = sc.nextInt();
        int W = sc.nextInt();
        
        // マス目のデータ(
      	char [][] tbl = new char[50][50];
        for (int i = 0; i < H; i++){
            String s = sc.next();
            for(int j = 0; j<W; j++){
                tbl[i][j] = s.charAt(j);
            }
        }
      
        int dx[] = {1, 1, 0, -1, -1, -1, 0, 1};
        int dy[] = {0, 1, 1, 1, 0, -1, -1, -1};
        
 
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (tbl[i][j] == '#') {
                    continue;
                }
                
                int num = 0;
                for (int d = 0; d < 8; d++) {
                    int ni = i + dx[d]; // h
                    int nj = j + dy[d]; // w
                    
                    // 基準から１つ移動したマスの縦軸がマイナスかマスの最大以上の場合、チェック対象外
                    if (ni < 0 || H <= ni) { 
                        continue;
                    }
                    
                    // 基準から１つ移動したマスの横軸がマイナスかマスの最大以上の場合、チェック対象外
                    if (nj < 0 || W <= nj) {
                        continue;
                    }
                    
                    // 基準から１つ移動したマスが有効かつ爆弾の場合、カウントアップ
                    if (tbl[ni][nj] == '#') {
                        num++;
                    }
                    
                    // カウント結果で上書き
                    tbl[i][j] = (char)(num + '0');
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