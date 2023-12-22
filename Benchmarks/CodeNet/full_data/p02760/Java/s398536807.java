import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int a[][] = new int[3][3];
    
    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 3; j++){
        a[i][j] = sc.nextInt();
      }
    }
    
    int n = sc.nextInt();
    
    int b[] = new int[n];
    
    for(int i = 0; i < n; i++){
      b[i] = sc.nextInt();
    }
    
    int count = 0;
    
    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 3; j++){
        for(int t = 0; t < n; t++){
          if(a[i][j] == b[t]){
            a[i][j] = 101;
          }
        }
      }
    }
    
    for(int i = 0; i < 3; i++){
      if((a[i][0] == 101) && (a[i][1] == 101) && (a[i][2] == 101)){
        count++;
      }
    }
    
    for(int i = 0; i < 3; i++){
      if((a[0][i] == 101) && (a[1][i] == 101) && (a[2][i] == 101)){
        count++;
      }
    }
    
    if((a[0][0] == 101) && (a[1][1] == 101) && (a[2][2] == 101)){
      count++;
    }
    
    if((a[0][2] == 101) && (a[1][1] == 101) && (a[2][0] == 101)){
      count++;
    }
    
    if(count == 0){
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }
        
    sc.close();
     
  }
}
