import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str_scan = scan.nextLine();
    // スペース区切りで分ける
    var str = str_scan.split(" ");
    // int型へ変換
    int num1 = Integer.parseInt(str[0]);
    int num2 = Integer.parseInt(str[1]);
    var ans = "hoge";

    if ( ((num1 * num2) % 2 ) == 1) {
      ans = "Odd";
    }else{
      ans = "Even";
    }

    System.out.println(ans);
    scan.close();
  }
}