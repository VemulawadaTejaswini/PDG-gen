import java.util.Scanner;
public class Main{
  public static void main(string[] args){
    Scanner scan = new Scanner(System.in);
    int x = new scan.nextInt();
    
    if(x == 2){
      System.out.println(x);
    }
    
    boolean s = false;
    
    while(s == false){
      
      
      for(int i = 2; i < n; i ++){
        if(x % i == 0){
          s = false;
          break;
        }
        s = true;
      }
      
      
      
      x += 1;
    }
    
    System.out.println(x-1);
    
  }
}