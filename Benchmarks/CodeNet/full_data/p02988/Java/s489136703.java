import java.util.Scanner;
import java.util.Arrays; 
import java.util.*; 

public class Main{
  
  public static void main (String [] args){
    
    Scanner scanner = new Scanner(System.in);     
    
    int num1 = scanner.nextInt();
    
    int [ ] a = new int [num1];
    
    for(int i = 1; i < a.length - 1; i++) {
      
      a[i]=scanner.nextInt();
      
      if((a[i-1] < a[i]) && (a[i] < a[i + 1])){
        num1++;
      } else if ((a[i - 1] > a[i]) && (a[i] > a[i+1])) {
        num1++;
      }
      
    }
    
    System.out.println(Arrays.toString(a));
 
    scanner.close();
    
  }
  
}