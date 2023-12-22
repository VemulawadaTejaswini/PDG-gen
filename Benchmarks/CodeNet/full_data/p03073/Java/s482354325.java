import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        System.out.println(new Main().solve());
    }
    
    // パラメタ渡しもちゃんとクラス作るのも面倒なので手抜き
    // 必要な値はここで全部取ってしまう
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    
    
    int solve() {
        char[] c = s.toCharArray();
        int countA = 0;
        
        // 左端0の場合
        char head = '0';
        for(int i = 0; i < c.length; i++) {
            if(i % 2 == 0) {
                if(c[i] == head) {
                    countA++;
                }
            } else {
                if(c[i] != head) {
                    countA++;
                }
            }
        }
        
        
        int countB = 0;
        
        // 左端0の場合
        head = '1';
        for(int i = 0; i < c.length; i++) {
            if(i % 2 == 0) {
                if(c[i] == head) {
                    countB++;
                }
            } else {
                if(c[i] != head) {
                    countB++;
                }
            }
        }
        
        
        return countA < countB ? countA : countB;
    }
    
    // int solve() {
    //     char[] c = s.toCharArray();
        
    //     char head = c[0];
        
    //     int evenOk = 0;
    //     int oddOk = 0;
        
    //     for(int i = 0; i < c.length; i++) {
            
    //         if(i % 2 == 0) {
    //             if(c[i] == head) {
    //                 evenOk++;
    //             }
    //         } else {
    //             if(c[i] != head) {
    //                 oddOk++;
    //             }
    //         }
            
    //     }
        
    //     // 最大手数
    //     int max = c.length - evenOk - oddOk;
        
    //     if(max == 0) {
    //         return 0;
    //     }
        
    //     // 左端を1と仮定してカウント
    //     // 0としてカウント
    //     // 少ない方
        
        
    //     return max;
    // }
}
