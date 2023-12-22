import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println(calc(sc.nextLong(),2)-1);
    
  }
  
  public static long calc(long x,long sum){
    return x == 1 ? sum : calc(x/2,sum * 2);
}
}