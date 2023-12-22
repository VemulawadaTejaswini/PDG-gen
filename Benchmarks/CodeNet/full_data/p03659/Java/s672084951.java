import java.util.*;

public class Main {        
    
  public static void main(String[] args) {              
     
      Scanner sc = new Scanner(System.in);                                    
    
      int N = sc.nextInt();
      
      int a[] = new int[N];
      
      for(int i = 0;i < N;i++){
          a[i] = sc.nextInt();
      }
      
      int min = Integer.MAX_VALUE;
      
      for(int m = 0;m <= N - 2;m++){
          int x = 0;
          int y = 0;
          for(int i = 0;i <= m;i++){
              x += a[i];
          }
          for(int j = m+1;j <= N - 1;j++){
              y += a[j];
          }          
          min = Math.min(min,Math.abs(x - y));
      }            
      
      System.out.println(min);
     
  }     
}

