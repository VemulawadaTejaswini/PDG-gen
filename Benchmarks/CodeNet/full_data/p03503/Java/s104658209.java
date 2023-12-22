import java.util.Scanner;
 
class Main {
  public static void main(Stirng[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[][] F = new int[N.length][10];
    int[][] P = new int[N.length][11];
    int[] PSum = new int[10];
    int[] count = new int[N.length];
    int sum = 0;
    for(int i=0;i<N.length;i++){
      for(int j= 0;j<9;j++){
        F[i][j] = sc.nextInt();
      }
    }
    for(int i=0;i<N.length-1;i++){
      for(int j= 0;j<10;j++){
        P[i][j] = sc.nextInt();
      }
    }
    for(int i=0;i<N.length-1;i++){
      for(int j=0;j<9;i++){
        if(F[i][j]==1){
          count[i]++;
        }
      }
      for(int j=0;j<9;i++){
        PSum[j] += P[count[i]][j];
      }
    }
    for(int j=0;j<9;j++){
      if((sum <= 0) && (sum >= PSum[j])) sum = PSum[j];
      else if(sum >= 0) sum += PSum[j];
    }
    System.out.println(sum);
  }
} 