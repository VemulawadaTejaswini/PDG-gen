import java.util.*;
public class Main{
  static public void main(String ... args){
    final Scanner sc = new Scanner(System.in);
    final int N = sc.nextInt();
    final int A = sc.nextInt();
    final int B = sc.nextInt();
    if(N * A < B ){
      System.out.println(N*A);
    }else{
      System.out.println(B);
    }
    sc.close();
  }
}