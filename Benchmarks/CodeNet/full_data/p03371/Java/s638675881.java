import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();

    int ayen = a * x;
    int byen = b * y;
    if(a + b <= 2 * c){
      System.out.println(ayen + byen);
    }else{
      int total = ayen + byen;
      int sagaku = a + b - 2 * c;
      while(x >= 1 && y >= 1){
        x--;
        y--;
        total -= sagaku;
      }
      System.out.println(total);
    }
  }
}
