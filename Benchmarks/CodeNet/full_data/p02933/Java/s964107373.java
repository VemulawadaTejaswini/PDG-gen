import java.util.Scanner;
public class Main {
  public static void main(String... args) {
    String out = "red";
    try (Scanner scan = new Scanner(System.in)) {
      int num = Integer.valueOf(args[0]);//scan.nextInt();
      if (num >= 3200) out = args[1];//scan.nextLine();
    } catch (Exception e) {}
    System.out.println(out);
  }
}