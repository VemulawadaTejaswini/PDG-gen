import java.util.*;
 
public class Main{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N=sc.nextInt(), count=0, a;
    
    for(int i=0; i<N; i++) {
      a = sc.nextInt();
      while(a % 2 == 0) {
        count++;
        a /= 2;
      }
    }
 
    System.out.println(count);   
  }
}