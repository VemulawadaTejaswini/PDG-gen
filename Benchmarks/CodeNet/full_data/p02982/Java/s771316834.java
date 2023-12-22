import java.util.*;
 
public class Main {
  public static void main (String[] arg) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int D = scan.nextInt();
    int X[][] = new int[N][D];
    int count = 0;
    
    for (int i = 0; i < N; i++){
      for(int j = 0; j < D; j++){
        X[i][j] = scan.nextInt();
      }
      
      for(int k = 0; k < i; k++){
        int kyori = 0;
        for(int j = 0; j < D; j++){
          kyori += Math.abs(X[i][j]-X[k][j])*Math.abs(X[i][j]-X[k][j]);
        }
        if((Math.sqrt(kyori)*10)%10 == 0){
          count++;
        }
      }
    }
    
    System.out.println(count);
  }
}