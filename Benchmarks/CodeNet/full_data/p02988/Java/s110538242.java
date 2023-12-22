import java.util.*; 
 
public class Main{
  
  public static void main (String [] args){
    Scanner scanner = new Scanner(System.in);     
    int num1 = scanner.nextInt();
    
    int a [ ] = new int [num1];
    
    int t = 0;
    
    for(int i = 1; i < a.length-1; i++) {
      a[i]=scanner.nextInt();
      
      if((a[i-1] < a[i]) && (a[i] < a[i+1])){
        t++;  
      
      } else if ((a[i-1] > a[i]) && (a[i] > a[i+1])) {
        t++;
       
      }
    }
    System.out.println(t);    
  }
  
}