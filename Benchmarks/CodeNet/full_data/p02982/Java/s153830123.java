import java.util.*;
public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int D = sc.nextInt();
    int[][] X = new int[N][D];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < D; j++) {
        X[i][j] = sc.nextInt();
      }
    }
    sc.close();

    int count = 0;
    double distance = 0.0;

    for (int i = 0; i < N; i++) {
      for (int j = i; j < N; j++){
        if (i != j){
          distance = 0.0;
          for (int k = 0; k < D; k++) {
            distance += (X[i][k] - X[j][k]) * (X[i][k] - X[j][k]);
          }
          if (Math.sqrt(distance) % 1 == 0){
            count++;
          }
        }
      }
    }
    
    System.out.println(count);

  }
  
}