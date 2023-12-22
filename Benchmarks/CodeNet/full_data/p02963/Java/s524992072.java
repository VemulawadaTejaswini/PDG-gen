import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    long S = Long.parseLong(sc.next());
    
    long x1 = 1000000000;
    long y1 = 1;
    long x2 = S % x1;
    long y2 = S / x1;

    System.out.println(x1+" "+y1+" "+x2+" "+y2+" 0 0");
  }
}
