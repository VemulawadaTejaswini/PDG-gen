import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
	  String str = scan.next();
      
      // 変数strの長さ分回す
      for (int i = 0; i < str.length(); i++) {
          // 配列に順番に格納する
          strArray[i] = String.valueOf(str.charAt(i));
          strArray[i] = "x";
      }
      
      String s = String.join("", strArray);
      System.out.println(s);
      
    }
}