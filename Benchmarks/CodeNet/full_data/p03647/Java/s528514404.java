import java.util.*;

public class Main {    
    
  public static void main(String[] args) {
   
     Scanner sc = new Scanner(System.in);                                      
     
     int N = sc.nextInt();
     int M = sc.nextInt();
     
     boolean from[] = new boolean[N+1];
     boolean   to[] = new boolean[N+1];          
                    
      for(int i = 1;i <= M;i++){
          int a = sc.nextInt();
          int b = sc.nextInt();          
          if(a == 1)
              to[b] = true;
          
          if(b == N)
              from[a] = true;          
      }    
     
      for(int i = 2;i <= N-1;i++){
          if(from[i] && to[i]){
              System.out.println("POSSIBLE");
              return;
          }          
      }
      
      System.out.println("IMPOSSIBLE");      
                  
  }   
}