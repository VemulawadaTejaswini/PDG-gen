import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    int N;
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    int A[] = new int[N+2];
    int ans[] = new int[N];
    A[0] = 0;
    A[N+1] = 0;
    for(int i = 0; i < N; i++){
      A[i+1] = sc.nextInt();
    }
    for(int i = 0; i < N; i++){
      ans[i] = 0;
    }
    for(int i = 1; i <= N; i++){
      for(int j = 0; j < N+1; j++){
        if(j == i-1){
          
        }else if(j == i){
          ans[i-1] += Math.abs(A[j+1] - A[j-1]);
        }else{
          ans[i-1] += Math.abs(A[j+1] - A[j]);
        }
      }
    }
    for(int i = 0; i < N; i++){
      System.out.println(ans[i]);
    }    
  }
}