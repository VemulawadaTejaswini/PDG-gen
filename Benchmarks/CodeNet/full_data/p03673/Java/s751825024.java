import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A[] = new int[N];
    
    for(int i=0; i<N; i++){
      A[i]=sc.nextInt();
    }
    
    for(int i = N-1; i>=0; i-=2){
      System.out.print(A[i]+" ");
    }
    for(int i = N%2; i<N; i+=2){
      System.out.print(A[i]+" ");
    }
  }
}