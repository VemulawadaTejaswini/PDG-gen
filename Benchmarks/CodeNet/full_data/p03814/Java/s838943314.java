import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    //stringを取得
    
    int m = s.indexOf("A");
    int n = s.indexOf("Z", m);
    int ans = n-m+1;
    System.out.println(ans);
  }
}
