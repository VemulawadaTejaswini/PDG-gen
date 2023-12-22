import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    double a=scan.nextDouble();
    double b=scan.nextDouble();
    double x=scan.nextDouble();
    
    double S=x/a;
    double h=0;
    if(S>=a*b/2){
      h=(double)(a*b-S)*2/a;
    }else{
      a=(double)S/b;
      h=b;
    }
    System.out.println(Math.toDegrees(Math.atan((double)h/a)));
  }
}