import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in);) {
      String input = sc.next();

      String answer ="";
      if("A".equals(input)) {
        answer = "T";
      }else if("T".equals(input)) {
        answer = "A";
      }else if("C".equals(input)) {
        answer = "G";
      }else {
        answer = "C";
      }

      System.out.println(answer);
    }
  }
}