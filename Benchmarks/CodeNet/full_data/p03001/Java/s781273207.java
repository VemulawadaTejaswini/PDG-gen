import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int w = sc.nextInt();
  	int h = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    double area = (w*h) / 2.0;
    int aaa =0;
    if((2*x) == (w) && (2*y) ==(h) )
      aaa=1;
    if(x==0 && y==0)
      area = 0.0;
    System.out.println(area + " " + aaa );
  }
}