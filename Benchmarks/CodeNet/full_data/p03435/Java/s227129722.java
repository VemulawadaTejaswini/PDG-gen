import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int grid[][] = new int[3][3];
    int a[] = new int[3];
    int b[] = new int[3];
    
    for(int i=0; i<3; i++){
      for(int j=0; j<3; j++){
        grid[i][j] = sc.nextInt();
      }
    }
    int cnt = 0;
    for(int i=0; i<3; i++){
      for(int j=0; j<3; j++){
        if (grid[i][j] == a[i] + b[j]){
          cnt++;
        }
      }
    }
    if(cnt == 9){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}