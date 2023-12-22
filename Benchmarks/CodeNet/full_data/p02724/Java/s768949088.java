import java.util.*;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int ans = 0;
    
    int b = a%500;
    
    ans = 1000*(a/500) + 5*(b/5);
    
    
    System.out.println(ans);
  }
}