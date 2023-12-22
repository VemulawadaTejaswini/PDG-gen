import java.util.*;
import java.lang.Math;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    
    int A[] = new int[N];
    
    for (int i = 0; i < N; i++) A[i] = sc.nextInt();
    
    Arrays.sort(A);
    
    boolean flg = false;
    
    for (int i = 0; i + 1 < N; i++) if (A[i] == A[i + 1]) flg = true;
    
    
    if (flg) {
      System.out.println("NO");
    } else {
      System.out.println("YES");
    }
  }
}