import java.util.Arrays;
import java.util.Scanner;
 
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ans = 0;

    int a = sc.nextInt();
    int b = sc.nextInt();
    ans = (a+b)/2;
    System.out.println(ans);

    sc.close();
  }
}
