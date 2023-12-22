import java.util.*;
 
public class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
 
    int min=1;
    int max=100000000;
    
    while(sc.hasNext()){
      int a = sc.nextInt();
      min = Math.min(min, a);
      max = Math.max(max, a);
     
    }
    System.out.println(Math.abs(max-min));
  }
}