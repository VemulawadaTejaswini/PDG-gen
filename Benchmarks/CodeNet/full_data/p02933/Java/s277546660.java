import java.util.Scanner;
public class Main {
  public static void main(String... args) {
    String out = "red";
    try (Scanner scan = new Scanner(System.in)) {
      int num = scan.nextInt();
      if (num >= 3200) out = scan.nextLine();
    } catch (Exception e) {}
    System.out.println(out);
  }
}