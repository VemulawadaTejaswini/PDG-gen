import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int x = sc.nextInt();
    double Re = 0;
    if(x<=a*a*b/2){
      Re = Math.atan(2*x/(a*b*b));
    }else{
      Re = Math.atan(a*a*a/(2*(a*a*b-x)));
    }
    System.out.println(90-Re*180/Math.PI);
  }
}