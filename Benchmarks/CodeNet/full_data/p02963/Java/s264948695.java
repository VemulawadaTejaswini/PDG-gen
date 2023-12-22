import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long s = sc.nextLong();
    int x1 =0;
    int y1=0;
    int x2=1000000000;
    int y2 =1;
    int x3=s/x2;
    int y3=s%x2;
    System.out.print(x1+" "+y1+" "+x2+" "+y2+" "+x3+" "+y3);
  }
}