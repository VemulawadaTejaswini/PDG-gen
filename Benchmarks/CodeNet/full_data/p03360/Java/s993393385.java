import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());
    int C = Integer.parseInt(sc.next());
    int K = Integer.parseInt(sc.next());
    
    int a = A;
    int b = B;
    int c = C;
    for(int i = 0; i < K; i++){
      a *= 2;
      b *= 2;
      c *= 2;
    }
    
    System.out.println(Math.max(a+B+C, Math.max(A+b+C, A+B+c)));
  }
}