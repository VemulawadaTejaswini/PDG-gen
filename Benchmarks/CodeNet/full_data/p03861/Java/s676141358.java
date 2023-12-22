import java.util.*;

public class Main{
  public static void main(String[] args){
    
    Scanner sn = new Scanner(System.in);
    
    long a = sn.nextInt();
    long b = sn.nextInt();
    long x = sn.nextInt();
    long ans = 0;
    
    for(long i = a; i <= b; i++){
      long calc = i % x;
      if(calc == 0){
        ans += 1;
      }
    }
    
    System.out.println(ans);
    
  }
}