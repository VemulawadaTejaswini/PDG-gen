import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String ans = "";
    for (int i = 0; i < 3; i++){
      for (int j = 0; j < 3; j++){
        String s = sc.next();
        if (i == j) ans += s;
      }
    }
    System.out.println(ans);
  }
}
