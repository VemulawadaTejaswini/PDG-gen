import java.util.Scanner;
import java.util.ArrayList;

public class Main{

  public static void main(String[] args){
  
      Scanner reader = new Scanner(System.in);
      int numRes = reader.nextInt();
      ArrayList<Integer> factors = new ArrayList<Integer>();
      int canA = 1;
      int canB = 1;
      
      for(int i = 0; i < numRes; i++){
         int num = reader.nextInt();
         int den = reader.nextInt();
                  
         double ratio = (double)num/den;
         double currRatio = (double)canA/canB;
         while(currRatio != ratio){
            if(currRatio > ratio){
               canB++;
            }
            
            if(currRatio < ratio){
               canA++;
            }
            
            currRatio = (double)canA/canB;
         }
         
      }
      
      
      
      System.out.println(canA + canB);
   }
}
      