import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String ans ="";
    for(int i = 0; i < S.length(); i++){
     ans += "×";
    }
    System.out.println(ans);
}
}
