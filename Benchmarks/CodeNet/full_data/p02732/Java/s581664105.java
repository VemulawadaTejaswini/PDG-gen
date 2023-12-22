import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A[] = new int[N+1];
    int B[] = new int[N];
    int sum = 0;
    for(int i = 0; i<N; i++){
      int tmp = sc.nextInt();
      B[i] = tmp;
      A[tmp]++;
      sum += A[tmp] - 1; 
    }
    for(int i = 0; i<N; i++){
      System.out.println(sum-A[B[i]]+1);
    }
  }  
}


