import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
 	int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int x = sc.nextInt();
    
    int count = 0;
    
    // 500円
    for(int i = 0; i <= a; i++){
      
      // 100円
      for(int j = 0; j <= b; j++){
        
        // 50円
        for(int k = 0; k <= c; k++){
          
          if(((i * 500) + (j * 100) + (k * 50)) == x){
            count++;
          }
          
        }
        
      }
      
    }
    
    System.out.println(count);
  }

}