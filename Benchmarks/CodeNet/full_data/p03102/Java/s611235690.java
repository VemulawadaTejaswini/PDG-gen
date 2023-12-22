import java.util.Scanner;
public class Main {
  public static void main (String[]args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int C = sc.nextInt();
    int B[] = new int[M];
    int A[][] = new int[M][N];

    for(int i = 0; i<M; i++){
      B[i] = sc.nextInt();
    }
    for(int i = 0; i<M; i++){
      for(int j = 0; j<N; j++){
        A[i][j] = sc.nextInt();
      }
    }
    int left_side=0;
    int counter=0;
    
    for(int j = 0; j<N; j++){
      for(int i = 0; i<M; i++){
        left_side += A[i][j]*B[i];
        if(left_side>-1*C) counter++;
      }
    }
    System.out.println(counter);
  }
}

//i...M(よこ)
//j...N(たて)
