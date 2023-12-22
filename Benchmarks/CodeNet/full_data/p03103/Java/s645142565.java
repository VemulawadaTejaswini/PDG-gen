import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] array = new int[n][2];
    int sum = 0;
    for(int i=0;i<n;++i){
      for(int j=0;j<2;++j){
        array[i][j]=sc.nextInt();
      }
    }
    int a,b=0;
    for(int i=0;i<n-1;++i){
      for(int j=i+1;j<n;++j){
        if(array[j][0]<array[i][0]){
          a=array[j][0];
          array[j][0]=array[i][0];
          array[i][0]=b;
          b=array[j][1];
          array[j][1]=array[i][1];
          array[i][1]=b;
        }
      }
    }
    for(int i=0;i<n;++i){
      if(array[i][1]<m){
        sum+=array[i][0]*array[i][1];
        m-=array[i][1];
      }else{
        sum+=array[i][0]*m;
        return 0;
      }
    }
    System.out.print(sum);
  }
}