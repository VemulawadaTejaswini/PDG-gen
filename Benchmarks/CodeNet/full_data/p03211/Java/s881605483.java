import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int s = S.length();
    int ans = 753;
    for(int i = 0; i < s-2; i++){
      int n = Integer.parseInt(S.substring(i, i+3));
      int m = Math.abs(753-n);
      ans = m < ans ? min : ans;
    }
    System.out.println(ans);
  }
}
