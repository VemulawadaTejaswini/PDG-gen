import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String s = input.nextLine();

    String[] d = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

    for (int i = 0; i < d.length; i++) {
      if (d[i].equals(s)) {
        System.out.println(7 - i);
      }
    }
  }
}
