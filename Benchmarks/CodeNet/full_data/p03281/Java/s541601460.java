/*
 * Click `Run` to execute the snippet below!
 */
 
import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int ans = 0;
    for(int n = 1; n<=N; n++){
      if(n%2 == 0){
        continue; 
      }
      int cnt = 0;
      
      for(int j = 1; j<=n; j++){
        if(n%j == 0){
          cnt++; 
        }
      }
      if(cnt == 8){
        ans++; 
      }
    }
    System.out.println(ans);
    
    
    
    
    
    /*
    Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        int count = 0;
        for (int i = 0; i < N; i++){
            if (i%2 != 0){
              int factorCount = 0;
                for (int j = 1; j <= i; i++){
                    if (i%j==0) factorCount++;
                }
                if (factorCount == 8) count++;
            }
        }
    */
  }
}
