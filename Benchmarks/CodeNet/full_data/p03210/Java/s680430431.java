import java.util.Arrays;
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      String ans = "NO";
      if(x==3||x==5||x==7){
        ans = "YES";
      }
      System.out.println(ans);
    }
}
