import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double a = sc.nextInt();
    double b = sc.nextInt();
    double x = sc.nextInt();
    double Re = 0;
    if(x<=a*a*b/2){
      Re = Math.atan(2*x/(a*b*b));
    }else{
      Re = Math.atan(a*a*a/(2*(a*a*b-x)));
    }
    System.out.println(90.0-Math.toDegrees(Re));
  }
}