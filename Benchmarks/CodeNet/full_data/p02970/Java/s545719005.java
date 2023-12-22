import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int D = Integer.parseInt(sc.next());
    int a = D*2+1;
    int ans = N%a == 0 ? N/a : N/a +1;
    
    System.out.println(ans);
  }
}