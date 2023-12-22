import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String strDate = sc.next();

    String[] dates = strDate.split("/");
    int month = Integer.parseInt(dates[1]);

    if (month > 4) {
      System.out.println("TBD");
    } else {
      System.out.println("Heisei");
    }
  }
}
