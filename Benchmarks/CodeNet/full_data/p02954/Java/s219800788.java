import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int[] A = new int[S.length()];
    int i = 0;
    while (i < S.length()) {
      int iRL = S.indexOf("RL", i);
      int numR = iRL - i;
      int iNextR = S.indexOf("R", iRL + 2);
      if (iNextR == -1) {
        iNextR = S.length();
      }
      int numL = iNextR - (iRL + 2);

      // RL(ab)
      int a = 1 + numR / 2 + (numL+1) / 2;
      int b = 1 + (numR + 1) / 2 + numL / 2;
      for (int j = i; j < iRL; j++) {
        A[j] = 0;
      }
      A[iRL] = a;
      A[iRL+1] = b;
        
      for (int j = iRL+2; j < iNextR; j++) {
        A[j] = 0;
      }
      
      // next
      i = iNextR;
    }
    System.out.println(Arrays.toString(A));
  }  
}