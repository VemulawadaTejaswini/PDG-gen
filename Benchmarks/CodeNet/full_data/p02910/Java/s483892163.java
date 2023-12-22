import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String str = scanner.next();
      
      String result = "Yes";
      for (int i = 0; i < str.length(); i++) {
        char input = str.charAt(i);
        if (input == 'U' || input == 'D') continue;
        
        char c = 'R';
        if (i % 2 == 1) c = 'L';
      	if (input != c) {
          result = "No";
          break;
        }
      }
      System.out.println(result);
    }
}
