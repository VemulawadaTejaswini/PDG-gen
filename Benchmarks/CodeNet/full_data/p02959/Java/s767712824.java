import java.math.*;
import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    BigInteger A[] = new BigInteger[N+1];
    BigInteger B[] = new BigInteger[N];
    BigInteger out = new BigInteger("0");
    for (int i=0; i<N+1; i++) {
      A[i] = sc.nextBigInteger();
    }
    for (int i=0; i<N; i++) {
      B[i] = sc.nextBigInteger();
    }
    for (int i=0; i<N; i++) {
      //if(A[i] > B[i]){
      if(A[i].compareTo(B[i]) == 1){
        out = out.add(B[i]);
        A[i] = A[i].subtract(B[i]);
        B[i] = B[i].subtract(B[i]);
      } else {
        out = out.add(A[i]);
        B[i] = B[i].subtract(A[i]);
        A[i] = A[i].subtract(A[i]);
      }
      if(A[i+1].compareTo(B[i]) == 1){
        out = out.add(B[i]);
        A[i+1] = A[i+1].subtract(B[i]);
        B[i] = B[i].subtract(B[i]);
      } else {
        out = out.add(A[i+1]);
        B[i] = B[i].subtract(A[i+1]);
        A[i+1] = A[i+1].subtract(A[i+1]);
      }
    }
    System.out.println(out);
  }
}
