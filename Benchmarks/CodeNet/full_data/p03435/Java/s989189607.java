import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int g[][] = new int[3][3];
    int a[] = new int[3];
    int b[] = new int[3];
    
    for(int i=0; i<3; i++){
      for(int j=0; j<3; j++){
        g[i][j] = sc.nextInt();
      }
    }
    if((g[0][0] + g[1][1] == g[0][1] + g[1][0])
       && (g[0][1] + g[1][2] == g[0][2] + g[1][1])
       && (g[1][0] + g[2][1] == g[1][1] + g[2][0])
       && (g[1][1] + g[2][2] == g[1][2] + g[2][1])){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}