import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    int N = scanner.nextInt();
    int A[] = new int[N];
    for(int i = 0;i < N;i++){
      A[i] = scanner.nextInt();
    }
    
    String answer = "Yes";
    for(int i = 0;i < N;i++){
      for(int j = 0;j < N;j++){
        if(i != j){
          if(A[i] == A[j]){
            answer = "No";
          }
        }
      }
    }
    System.out.println(answer);
  }
}