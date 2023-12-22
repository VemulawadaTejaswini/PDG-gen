import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long ans = x / 11 * 2;
    if((x % 11) > 6){
      ans += 2;
    }else if(x % 11 == 0){
      
    }else{
      ans += 1;
    }
    System.out.println(ans);
  }
}