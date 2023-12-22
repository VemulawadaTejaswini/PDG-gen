import java.util.*;

class Main{
  public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int ans = (b*c+(a-b*d));
    System.out.println(ans);
  }
}