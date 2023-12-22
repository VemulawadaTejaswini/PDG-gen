import java.util.*;
public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String[] data = new String[2];

    data[0] = "2019/04/30";
    data[1] = sc.nextLine();

    Arrays.sort(data);

    if (data[1].equals("2019/04/30")) {
      System.out.println("Heisei");
    } else {
      System.out.println("TBD");
    }
  }
}
