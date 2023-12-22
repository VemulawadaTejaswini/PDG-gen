import java.util.Scanner;
 
public class Main{
  public static void main(String[] args){
	Scanner in=new Scanner(System.in);
  	int W=in.nextInt();
    int H=in.nextInt();
    int x=in.nextInt();
    int y=in.nextInt();
    int m;
    double mid_W=W/2;
    double mid_H=H/2;
    if(mid_W==x || mid_H==y)
      m=1;
    else
      m=0;
    double area=W*H/2;
    System.out.println(area+" "+m);
    in.close();
  }
}