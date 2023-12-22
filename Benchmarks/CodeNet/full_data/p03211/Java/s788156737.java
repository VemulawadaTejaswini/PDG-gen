import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int ans = 642;

    for(int i = 0 ; i < s.length()-2 ; ++i){
      int num = Integer.parseInt(s.substring(i,i+3));
      int num2 = Math.abs(Math.subtractExact(753, num));

      ans = Math.min(ans, num2);
      
    }

    System.out.println(ans);
    
  }
}