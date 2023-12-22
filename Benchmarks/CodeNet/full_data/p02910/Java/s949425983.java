import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String str = scanner.next();
      
      String result = "Yes";
      for (int i = 0; i < str.length(); i++) {
        char c = 'R';
        if (i % 2 == 0) c = 'L';
      	if (str.charAt(i) != c) {
          result = "No";
          break;
        }
      }
      System.out.println(result);
    }
}
