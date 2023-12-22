import java.util.Scanner;

public class Main {
  	public static void main(String[] args){
      //入力値の取得
      Scanner sc = new Scanner(System.in);
      String str = sc.next();
      sc.close();

      if (str.indexOf("A") == -1 || str.indexOf("B") == -1) {
    	  System.out.println("No");
      } else {
    	  System.out.println("Yes");
      }
  	}
}