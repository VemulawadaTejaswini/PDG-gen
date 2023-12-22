import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int g = Integer.parseInt(sc.next());
    for(int i = 0; i < N-1; i++){
      int a = Integer.parseInt(sc.next());
      g = gcd(g, a);
    }
    System.out.println(g);
  }
  public static int gcd(int a, int b){
    if(b < a){
      return gcd(b, a);
    }
    
    if(a == 0){
      return b;
    }
    
    return gcd(b%a, a);
  }
}