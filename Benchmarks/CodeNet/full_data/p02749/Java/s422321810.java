import java.util.Scanner;
public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ab[][] = new int[n][n];
    int a, b;
    while(sc.hasNext()){
      a = sc.nextInt();
      b = sc.nextInt();
      ab[a-1][b-1]++;
      ab[b-1][a-1]++;
    }
    int three = n/3;
    int start, end;
    for(int i = 0; i < n; i++){
      end = 0;
      start = i+1;
      for(int j = 0; j < n; j++){
        if(ab[i][j]==1){
          for(int k = 0; k < n; k++){
            if(ab[j][k]==1&&k!=i){
              for(int l = 0; l < n; l++){
                if(ab[k][l]==1&&l!=j&&l!=i){
                  end = l+1;
                  if(start<end){
                    System.err.println("start="+start+" end="+end);
                  }
                }
              }
              if(end==0) System.err.println(-1);
            }
          }
        }
      }
    }
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        System.err.print(ab[i][j]);
      }
      System.err.println();
    }
  }
}