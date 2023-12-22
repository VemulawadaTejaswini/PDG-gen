import java.util.Scanner;

public class Main {
  public static void main(String [] args) {
    Scanner scanner = new Scanner(System.in);
     int a = scanner.nextInt();
     int b = scanner.nextInt();

     judge(a,b);

  }
  public static void judge (int a ,int b){
    // 奇数偶数判定
    if (a * b % 2 == 0 ) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }
  }
}
