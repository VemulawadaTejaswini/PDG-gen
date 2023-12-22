import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A[] = new int[N];
    int num[] = new int[N];
    for(int i = 0; i < N; i++){
      A[i] = sc.nextInt()-1;
      num[A[i]]++;
    }
    int sum;
    for(int i = 0; i < N; i++){
      sum = 0;
      num[A[i]]--;
      for(int j = 0; j < N; j++){
        sum += num[j]*(num[j]-1)/2;
      }
      System.out.println(sum);
      num[A[i]]++;
    }
  }
}