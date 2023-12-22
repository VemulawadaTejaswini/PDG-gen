import java.util.*;
public class Main{
  public static void main(String args[]);
  Scanner sc = new Scanner(System.in);
  int A = sc.nextInt();
  int B = sc.nextInt();
  int C = sc.nextInt();
  int x = A/B;
  if(x<C){
    System.out.println(x);
  }else{
    System.out.println(C);
  }
 }
}
