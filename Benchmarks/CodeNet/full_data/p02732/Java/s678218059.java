import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A[] = new int[N];
    long num[] = new long[N];
    for(int i = 0; i < N; i++){
      A[i] = sc.nextInt()-1;
      num[A[i]]++;
    }
    long com[] = new long[N];
    long max = 0;
    for(int i = 0; i < N; i++){
      com[i] = (num[i]*(num[i]-1))/2;
      max += com[i];
    }
    for(int i = 0; i < N; i++){
      System.out.println(max - com[A[i]] + ((num[A[i]]-1)*(num[A[i]]-2))/2);
    }
  }
}