import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int X = scanner.nextInt();
    int[] A = new int[100];
    int ret = 0;
    for (int i = 0; i < M; i++){
      A[i] = scanner.nextInt();
    }
    for (int i = 0; i < M; i++){
      if (A[i] < M && M < A[i + 1])
      ret = Math.min(M - i - 1, i + 1);
    }
    System.out.println(ret);
  }
}