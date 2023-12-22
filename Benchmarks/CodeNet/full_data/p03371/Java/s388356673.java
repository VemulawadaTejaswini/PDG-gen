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
    int total = ayen + byen;
    int sagaku = a + b - 2 * c;
    int mai = Math.max(x,y);
    for(int i = 1;i<mai;i++){
      total = Math.min(total,total - sagaku);
    }
    System.out.println(total);
  }
}
