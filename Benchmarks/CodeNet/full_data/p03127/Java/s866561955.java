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
    int n = Integer.parseInt(sc.next());
    {sc.nextLine();}
    int[] a = IntStream.range(0, n).map(i -> Integer.parseInt(sc.next())).toArray();
    // // ソートしておく
    // List<Integer> a = IntStream.range(0, n)
    //                             .map(i -> Integer.parseInt(sc.next()))
    //                             .sorted()
    //                             .boxed().collect(Collectors.toList());
    
    int solve() {
        
        // a の最大公約数を求める
        int gcd = a[0];
        for(int i = 1; i < n; i++) {
            gcd = gcd(gcd, a[i]);
        }
        
        
        // 嘘くさい
        return gcd;
    }
    
    static int gcd(int a, int b) {
        int tmp;
        while(true) {
            tmp = a % b;
            if(tmp == 0) {
                return b;
            }
            a = b;
            b = tmp;
        }
    }
}


