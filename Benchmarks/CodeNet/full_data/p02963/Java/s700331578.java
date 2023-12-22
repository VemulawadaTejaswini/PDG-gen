import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long s = sc.nextLong();
    long x1 =0;
    long y1=0;
    long x2=1000000000;
    long y2 =1;
    long x3=s/x2;
    long y3=s%x2;
    System.out.print(x1+" "+y1+" "+x2+" "+y2+" "+x3+" "+y3);
  }
}