import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double x = sc.nextDouble();
    double th = 0;
    if(x>(a*a*b)/2){
     th = Math.toDegrees(Math.atan((2*a*a*b-2*x)/(a*a*a)));
    }else{
      th = Math.toDegrees(Math.atan((a*b*b)/(2*x)));
    }
  
  System.out.println(th);  
    
    
  }
  

  
}