import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A[];
    A = new int[N];
    int B[];
    B = new int[N];
    int C[];
    C = new int [N -1];
    int count = 0;
    for(int  i = 1; i <= N; i++){
      A[i] = sc.nextInt();
      B[i] = sc.nextInt();
      C[i] = sc.nextInt();
      count += B[A[i]];
        if(B[i + 1] - B[i] == 1){
          count += C[i];
        }
    }
    System.out.println(count);
  }
}
    
   
      