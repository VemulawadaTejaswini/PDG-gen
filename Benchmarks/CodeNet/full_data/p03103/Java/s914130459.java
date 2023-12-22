import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[][] AB = int[N][N];
    for(int i=0; i<N; i++){
     for(int j=0; j<N; j++){
       AB[i][j] = sc.nextInt();
     }
    }
    TheComparator comparator = new TheComparator;
    comparator.setIndex(1);
    Arrays.sort(AB, comparator);
    int honnsuu;
    int sum;
    for(int i=0; i<N; i++){
      honnsuu += AB[i][1];
      if(honnsuu <= M){
        sum += AB[i][0] * AB[i][1];
      }else{
        sum += AB[i][0] * (AB[i][1] - (honnsuu - M));
      }
    }
    System.out.print(sum);
  }
}