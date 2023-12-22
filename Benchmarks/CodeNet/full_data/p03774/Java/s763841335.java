import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int M = sc.nextInt();
   int[][] a = new int[N][2];
   int[][] c = new int[M][2];
    for(int aa=0; aa<N; aa++){
      a[aa][0] = sc.nextInt();
      a[aa][1] = sc.nextInt();
    }
     for(int cc=0; cc<M; cc++){
      c[cc][0] = sc.nextInt();
      c[cc][1] = sc.nextInt();
    }
   for(int i=0; i<N; i++){
     double min = Math.pow(10,8);
     int min_no=0;
     for(int j=M-1; j>=0; j--){
       double distance = Math.abs(a[i][0]-c[j][0]) + Math.abs(a[i][1]-c[j][1]);
      if(min>=distance){
        min = distance;
        min_no=j+1;
      }
     }
     System.out.println(min_no);
   }
    
  }
}
