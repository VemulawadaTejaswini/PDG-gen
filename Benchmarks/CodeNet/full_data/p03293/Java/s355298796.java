import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String T = sc.next();
    String ans = "No";

    for(int i = 0; i <= T.length(); i++){
      if(S.equals(T)){
        ans = "Yes";
        break;
      }
      S = S.substring(S.length() - 1) + S.substring(0, S.length() - 1); //endIndexで指定したインデックスの文字は切り出しに含まれないことに注意
    }
    System.out.println(ans);
  }
}
