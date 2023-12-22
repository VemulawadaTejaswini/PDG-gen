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
    int n = sc.nextInt();
    int k = sc.nextInt();
    String s = sc.next();
    char[] c = s.toCharArray();
    
    int solve() {
        
        // ベタにやると n * n
        // メモ化する？
        // 一旦連続数を記録して
        // でも10101010...みたいなのはどうする？ 最大連続数をもっとく？
        
        // 1だけの区間と0だけの区間が最大 k 回連続する区間を探す
        // 区間連続数が最大でない区間が一番多い可能性もある？ 11110101011110
        // 先頭からカウントして数を記録
        // 次は次のブロックかカウントして数を記録　前回より多ければ残す　以下同様？
        
        // List<Integer> countList = countList();
        int[] countArray = countArray();
        
        // c[0] の値と countList の偶奇でどっちのブロックかはわかる
        // index偶数が逆立ち
        boolean oddHandstand = c[0] == '0';
        // 端が逆立ちなら奇数番目を反転させる
        // 端が絡まなければ必ず 1 と 1 で挟まれる区間になるので最大 k * 2 + 1 区間の和が最大になるもの
        // 片方が端の場合は 最大 k * 2
        // 両端が1の場合は n が答えになる
        
        int max = 0;
        int current = 0;
        int nextIndex = 0;
        int start = 0;
        // if(oddHandstand) {
        //     start = 1;
        //     current = countArray[0];
        // }
        
        for(int i = start; i < countArray.length; i++) {
            int nextSize = nextIndex + (k * 2 + 1);
            // 端かどうかで +1 が変わる?
            if(oddHandstand && i == 0) {
                nextSize--;
            }
            if(nextSize > countArray.length) {
                nextSize = countArray.length;
            }
            if(nextSize == countArray.length) {
                if((oddHandstand && countArray.length % 2 == 1) || 
                   (!oddHandstand && countArray.length % 2 == 0)) {
                    nextIndex ++;
                }
            }
            for(int j = nextIndex; j < nextSize; j++) {
                current += countArray[j];
            }
            if(current > max) {
                max = current;
            }
            current = 0;
            nextIndex++;
        }
        
        return max;
    }
    
    int[] countArray() {
        List<Integer> countList = new ArrayList<>();
        // 最初を入れておく　気持ち悪いが
        char tmp = c[0];
        int tmpCount = 1;
        for(int i = 1; i < c.length; i++) {
            if(c[i] == tmp) {
                tmpCount++;
            } else {
                tmp = c[i];
                countList.add(tmpCount);
                tmpCount = 1;
            }
        }
        // 末尾処理
        countList.add(tmpCount);
        
        int[] countArray = new int[countList.size()];
        for(int i = 0, size = countList.size(); i < size; i++) {
            countArray[i] = countList.get(i);
        }
        
        // System.out.println(countList);
        
        return countArray;
    }
    
}
