import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    System.out.println(func(A, B));
  }
  
  static long func(long A, long B){
    if(A == B) return A;
    if(A%2 == 1) return A^func(A+1, B);
    if(B%2 == 0) return func(A, B-1)^B;
    long C = (B-A+1)/2;
    return C%2 == 0 ? 0 : 1;
  }
}