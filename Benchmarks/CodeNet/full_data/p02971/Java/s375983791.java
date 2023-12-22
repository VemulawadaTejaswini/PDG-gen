import java.util.*;
 
public class Main {
  public static void main (String[] arg) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int A[] = new int[N];
    int Max = 0;
    int Maxi = 0;
    int Max2 = 0;
    
    for (int i = 0; i < N; i++){
      A[i] = scan.nextInt();
      if(A[i] > Max){
        Max2 = Max;
        Max = A[i];
        Maxi = i;
      } else if(A[i] > Max2){
        Max2 = A[i];
      }
    }
    
    for(int i = 0; i < N; i++){
      if(i == Maxi){
        System.out.println(Max2);
      } else {
        System.out.println(Max);
      }
    }
  }
}