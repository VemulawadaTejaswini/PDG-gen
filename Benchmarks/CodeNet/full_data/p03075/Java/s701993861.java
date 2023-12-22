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
    // int n = Integer.parseInt(sc.next());
    // {sc.nextLine();}
    int[] a = IntStream.range(0, 5).map(i -> Integer.parseInt(sc.next())).toArray();
    int k =  Integer.parseInt(sc.next());
    String solve() {
        for(int i : a) {
            for(int j : a) {
                if(i - j > k) {
                    return ":(";
                }
            }
        }
        return "Yay!";
    }
    
}
// public class Main {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         int d = sc.nextInt();
//         int e = sc.nextInt();
        
//         IntStream.of(a, b, c, d, e).
//         int k = sc.nextInt();
//         System.out.println();
//     }
    
//     // // パラメタ渡しもちゃんとクラス作るのも面倒なので手抜き
//     // // 必要な値はここで全部取ってしまう
//     // Scanner sc = new Scanner(System.in);
//     // int n = Integer.parseInt(sc.next());
//     // {sc.nextLine();}
//     // int[] a = IntStream.range(0, n).map(i -> Integer.parseInt(sc.next())).toArray();
    
//     // String solve() {
//     //     return n + "" + Arrays.toString(a);
//     // }
    
// }
