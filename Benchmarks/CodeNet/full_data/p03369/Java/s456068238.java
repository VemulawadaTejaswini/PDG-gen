import java.util.*;

public class Main{
  public static void main(String[] args) {
    try {
      Scanner sc = new Scanner(System.in);
      int a,b,c,x,y,pay;

      a=Integer.parseInt(sc.next());
      b=Integer.parseInt(sc.next());
      c=Integer.parseInt(sc.next());
      x=Integer.parseInt(sc.next());
      y=Integer.parseInt(sc.next());

      pay=a*x + b*y;

      if(x>=y){
        if(pay>(a*x-a*y+2*c*y)){
          pay=a*x-a*y+2*c*y;
        }
        if(pay>(2*c*x)){
          pay=2*c*x;
        }
      }else{
        if(pay>(2*c*x+b*y-b*x)){
          pay=2*c*x+b*y-b*x;
        }
        if(pay>2*c*y){
          pay=2*c*y;
        }
      }

      System.out.println(pay);
      
      
    }
    catch (Exception e) {
      
    }
  }
}