import java.util.Scanner;

public class Main {
    
  public static void main(String[] args) {
    int result = 0;
    String s, c;
    Scanner scanner = new Scanner(System.in);
    s = scanner.nextLine();
    c = "CODEFESTIVAL2016";
    for (int i = 0; i < 16; i++) {
        if (s.charAt(i) != c.charAt(i)) {
            result++;
        }
    }
    scanner.close();

    System.out.println(result);
  }
}