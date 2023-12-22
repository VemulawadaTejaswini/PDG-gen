import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

  double x1_min = (double)a *12.5;
  int x1_max = (int)((a+1)*12.5);
  if(a%2==1){
    x1_min = (int)x1_min + 1;
  }

  int x2_min = 10 * b;
  int x2_max = 10 * (b+1);
  if((int)x1_min<=x2_min && x2_min<=x1_max){
    System.out.println(x2_min);
  }else if(x2_min<=(int)x1_min && (int)x1_min<=x2_max){
    System.out.println((int)(x1_min+(x1_min-1)/x1_min));
  }




 }
}