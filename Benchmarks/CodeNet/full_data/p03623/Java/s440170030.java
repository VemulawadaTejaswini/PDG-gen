
import java.util.Scanner;

class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
//Math.adsで絶対値(+-)を取得
    int aa = x - a;
      if (Math.abs(x - a) < Math.abs(x - b)){
      System.out.println("A") ;
      }
      else {
      System.out.println("B") ;
      }
  }
}
