import java.util.*;

class Main {
  //パスワード入力
  static Scanner sc = new Scanner(System.in);
  static String pw = sc.next();
  
  //判定
  public static String check(String pw) {
      for (int i=0; i < pw.length()-1; i++) {
      if (pw.substring(i, i+1).equals(pw.substring(i+1, i+2))) {
        return "Bad";
      }
    }
    return "Good";
  }
  
  //結果出力
  public static void main(String[] args) {
    String result = check(pw);
    System.out.println(result);
 }
 
}