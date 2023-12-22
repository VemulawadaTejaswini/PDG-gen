import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    boolean result = Math.pow(a,2)+ Math.pow(b,2) < Math.pow(c,2);
    if(result){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}
