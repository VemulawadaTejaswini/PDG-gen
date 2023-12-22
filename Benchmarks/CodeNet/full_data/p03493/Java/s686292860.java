
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner scanner = new Scanner(System.in);
    String inputStr = scanner.next();
    int bea = 0;
    if(inputStr.charAt(0) == '1') {
      bea++;
    }
    if(inputStr.charAt(1) == '1') {
      bea++;
    }
    if(inputStr.charAt(2) == '1') {
      bea++;
    }

    System.out.println(bea);


  }
}
