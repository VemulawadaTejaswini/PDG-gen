import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      String S = sc.next();
      
      // 回文判定
      int N = S.length();
      String frontStr = S.substring(0, (N-1)/2);
      String backStr = S.substring((N+1)/2, N);
      boolean judge1 = isPalindrome(S);
      boolean judge2 = isPalindrome(frontStr);
      boolean judge3 = isPalindrome(backStr);
      
      String result = "No";
      if(judge1 && judge2 && judge3){
        result = "Yes";
      }
      
      // 出力
      System.out.println(result);
    }
    
    // 文字列が回文であるか判定する関数
    public static boolean isPalindrome(String str){
      int length = str.length();
      boolean result = true;
      for(int i = 0; i < length / 2; i++){
        int index1 = i;
        int index2 = length - i - 1;
        char c1 = str.charAt(index1);
        char c2 = str.charAt(index2);
        if(c1 != c2){
          result = false;
          break;
        }
      }
      
      return result;
    }
    
    // 文字列のx文字目を取得する関数
    public static String strAt(String str, int x){
      return String.valueOf(str.charAt(x));
    }
    

}