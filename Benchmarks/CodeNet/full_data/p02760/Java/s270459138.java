import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[][] A = new int[3][3];
    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 3; j++){
        A[i][j] = sc.nextInt();
      }
    }
    
    int n = sc.nextInt();
    
    int[] b = new int[n];
    for(int k = 0; k < n; k++){
      b[k] = sc.nextInt();
    }
    
    int cnt = 0;
    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 3; j++){
        for(int k = 0; k < n; k++){
          if(A[i][j] == b[k]){
            A[i][j] = 0;
            cnt++;
          }
        }
      }
    }
    
    if(cnt < 3){
      System.out.println("No");
      return;
    }
  }
}