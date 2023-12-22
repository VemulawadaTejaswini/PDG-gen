import java.util.Scanner;

public class Main{
  
  public static void main (String [] args){
    
    Scanner scanner = new Scanner(System.in);     
    
    int num1 = scanner.nextInt();
    
    int num2 = scanner.nextInt();
    
    int a [] = {0,1,3,1,2,1,2,1,1,2,1,2,1};
    
    int x = a[num1];
      
    int y = a[num2];
      
      if (a[num1] == a[num2]){
      
      System.out.println("Yes");
        
      } else {
        
        System.out.println("No");
        
      }
    
    scanner.close();
    
  }
  
}
   