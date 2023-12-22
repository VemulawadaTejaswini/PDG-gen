import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    long s = sc.nextLong();
    long c = sc.nextLong();
    long ans = 0;
    if(s > c/2){
      ans = c/2;
    }else{
      ans = (c-s*2)/4 + s;
    }
    
    System.out.println(ans);
  }
}