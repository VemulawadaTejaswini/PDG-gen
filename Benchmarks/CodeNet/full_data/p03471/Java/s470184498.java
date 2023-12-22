import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Y = sc.nextInt();
    int x = Y/10000;
    int y = (Y%10000)/5000;
    int z = ((Y%10000)%5000)/1000;
    if(x+y+z>N){
      x = -1;
      y = -1;
      z = -1;
    }else if(x+y+z<N){
      int sum = x+y+z;
      int shortage = N-sum;
      int a = shortage/9;
      int b = (shortage%9)/4;
      int c = ((shortage%9)%4);
      x = x-(a+c);
      y = y-b+c*2;
      z = z+a*10+b*5;
    }
    System.out.println(x+" "+y+" "+z);
  }
}