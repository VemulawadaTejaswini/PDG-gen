import java.util.*;

public class Main {
    public static void main(String[] args) {
      
        int S = 4;       // 入力数
        int tScore = 0;  // 高橋くんの整数
      
        // 標準入力から値を取得してinputに入れる
        Scanner sc = new Scanner(System.in);
        char[] input = sc.nextLine().toCharArray();
        
        for (int i = 0; i < S; i++) {
            String tmp = String.valueOf(input[i]);
          
            if (tmp.equals("+")) {
                tScore = tScore + 1;
            } else {
                tScore = tScore - 1;
            }
        }
      
        System.out.println(tScore);
    }
}
