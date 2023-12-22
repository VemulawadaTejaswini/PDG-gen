import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    if(a*a+b*b+c*c>2*(a*b+b*c+c*a)){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
  

  
}
