import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();
    String ans = "";
    if (s.equals("A")) {
      ans = "T";
    } else if (s.equals("T")) {
      ans = "A";
    } else if (s.equals("G")) {
      ans = "C";
    } else if (s.equals("C")) {
      ans = "G";
    }
    System.out.println(ans);

  }

}
