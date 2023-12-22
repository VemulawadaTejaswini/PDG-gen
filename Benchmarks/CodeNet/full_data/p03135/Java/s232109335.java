import java.util.*;
public class Main{
  public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);
    
    int t = scanner.nextInt();
    int x = scanner.nextInt();
    
    if(0 < t && t < 101){
      if(0 < x && x < 101){
      
    double answer = 0;
    
    answer = t / x;
    
    System.out.println(answer);
      }
    }
  }
}