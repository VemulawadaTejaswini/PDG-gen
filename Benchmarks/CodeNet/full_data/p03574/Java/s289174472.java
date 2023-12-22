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
        
        // マス目のテーブル(input)
        // １文字ずつ分解
        String [][] in_tbl = new String[H][W];
        for(int i = 0; i<in_tbl.length; i++){
            for(int j = 0; j<in_tbl[0].length; j++){
                in_tbl[i][j] = String.valueOf(str_HW[i].charAt(j));
            }
        }
       
        // output
        String [][] out_tbl = new String[H][W]; 
        for(int i = 0; i<in_tbl.length; i++){
            for(int j = 0; j<in_tbl[0].length; j++){
                int count = 0;  // 出力用カウント
                
                // 現座標が爆弾の場合
                if (in_tbl[i][j].equals("#")){
                    out_tbl[i][j] = "#";
                
                } else { 
    
                // 現座標が爆弾以外の場合（８方向のチェック）
                
                if (i == 0){
                    if (j == 0){
                        if (in_tbl[i][j+1].equals("#")){
                            count++;
                        }
                        if (in_tbl[i+1][j].equals("#")){
                            count++;
                        }
                        if (in_tbl[i+1][j+1].equals("#")){
                            count++;
                        }
                    } else if (j < in_tbl[0].length - 1){
                        if (in_tbl[i][j-1].equals("#")) {
                            count++;
                        }
                        if (in_tbl[i][j+1].equals("#")) {
                            count++;
                        }
                        if (in_tbl[i+1][j-1].equals("#")) {
                            count++;
                        }
                        if (in_tbl[i+1][j].equals("#")) {
                            count++;
                        }
                        if (in_tbl[i+1][j+1].equals("#")){
                            count++;
                        }
                    } else {
                        if (in_tbl[i][j-1].equals("#")) {
                            count++;
                        }
                        if (in_tbl[i+1][j-1].equals("#")) {
                            count++;
                        }
                        if (in_tbl[i+1][j].equals("#")) {
                            count++;
                        }
                    }
                } else if (i <in_tbl.length - 1){
                    if (j == 0){
                        if (in_tbl[i-1][j].equals("#")){
                            count++;
                        }
                        if (in_tbl[i-1][j+1].equals("#")){
                            count++;
                        }
                        if (in_tbl[i][j+1].equals("#")){
                            count++;
                        }
                        if (in_tbl[i+1][j].equals("#")){
                            count++;
                        }
                        if (in_tbl[i+1][j+1].equals("#")){
                            count++;
                        }
                    } else if (j < in_tbl[0].length - 1 ){
                        if (in_tbl[i-1][j-1].equals("#"))  {
                            count++;
                        }
                        if (in_tbl[i-1][j].equals("#")) {
                            count++;
                        }
                        if (in_tbl[i-1][j+1].equals("#")) {
                            count++;
                        }
                        if (in_tbl[i][j-1].equals("#")) {
                            count++;
                        }
                        if (in_tbl[i][j+1].equals("#")) {
                            count++;
                        }
                        if (in_tbl[i+1][j-1].equals("#")) {
                            count++;
                        }
                        if (in_tbl[i+1][j].equals("#")) {
                            count++;
                        }
                        if (in_tbl[i+1][j+1].equals("#")) {
                            count++;
                        }                        
                    } else {
                        if (in_tbl[i-1][j-1].equals("#"))  {
                            count++;
                        }
                        if (in_tbl[i-1][j].equals("#")) {
                            count++;
                        } 
                        if (in_tbl[i][j-1].equals("#")) {
                            count++;
                        }
                        if (in_tbl[i+1][j-1].equals("#")) {
                            count++;
                        }
                        if (in_tbl[i+1][j].equals("#")) {
                            count++;
                        }                        
                    }
                } else {
                    if (j == 0){
                        if (in_tbl[i-1][j].equals("#")){
                            count++;
                        }
                        if (in_tbl[i-1][j+1].equals("#")){
                            count++;
                        }
                        if (in_tbl[i][j+1].equals("#")){
                            count++;
                        }
                    } else if (j < in_tbl[0].length - 1){
                        if (in_tbl[i-1][j-1].equals("#")) {
                            count++;
                        }
                        if (in_tbl[i-1][j].equals("#")) {
                            count++;
                        }
                        if (in_tbl[i-1][j+1].equals("#")) {
                            count++;
                        }
                        if (in_tbl[i][j-1].equals("#")) {
                            count++;
                        }
                        if (in_tbl[i][j+1].equals("#")){
                            count++;
                        }
                    } else {
                        if (in_tbl[i-1][j-1].equals("#")) {
                            count++;
                        }
                        if (in_tbl[i-1][j].equals("#")) {
                            count++;
                        }
                        if (in_tbl[i][j-1].equals("#")) {
                            count++;
                        }
                    }                    
                }
                out_tbl[i][j] = String.valueOf(count);
                }
                
                
            }
        }       
        
        // 出力
        for(int i = 0; i<out_tbl.length; i++){
            for(int j = 0; j<out_tbl[0].length; j++){
                System.out.print(out_tbl[i][j]);
            }
            System.out.println();
        }
    }
}
