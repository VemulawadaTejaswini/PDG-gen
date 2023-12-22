import java.util.*;
import java.math.*; 

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N= sc.nextInt();
    int[] A = new int[N];
    int count[] = new int[N];
    int check =0, total =0;
    for (int i =0; i<N; i++) {
      A[i] = sc.nextInt();
      if ((A[i] * N) % 2 != 0) {
        check++;
        break;
      }
      total += A[i];
    }
    if (total != N * N / 2) {
      check++;
    } 
    for (int i =N-1; i>0; i-=2) {
      for (int j =0; j<N; j++) {
         if (A[j] == i) {
              count[i]++;
         }
      }
      if (count[i] != 2) {
        check++;
        break;
      }
    }
    BigDecimal a = new BigDecimal("2");
    BigDecimal b = new BigDecimal("2");
    BigDecimal c = new BigDecimal("1000000007");
    for (int i =1; i<= N/2; i++) {
      a = a.multiply(b);
    }
    a = a.remainder(c);
    if (check == 0) {
      System.out.println(a);
    } else {
      System.out.println(0);
    }
  } 
}