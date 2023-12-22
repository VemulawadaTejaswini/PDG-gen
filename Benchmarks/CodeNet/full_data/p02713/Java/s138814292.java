import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {

      
 public static void main(String[] args) {
    
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int K = in.nextInt();
    long sum = 0;
    for(int i = 1; i <= K; i++) {
      for(int j = 1; j <= K; j++) {
          for(int k = 1; k <= K; k++) {
              sum += gcd(i, gcd(j, k));
          }
      }
    }
    
    System.out.println(sum);
    
  }
  
  private static int gcd(int a, int b) {
      while( a != b) {
          if(a > b){
              a = a - b;
          }
          else {
              b = b - a;
          }
      }
      
      return a;
  }
  
  
}