import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) throws Exception {

    String S = sc.next();

    SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd");
    Date d = sdFormat.parse(S);

    Date d2 = sdFormat.parse("2019/04/30");

    if (d.compareTo(d2) <= 0) {
      System.out.println("Heisei");
    } else {
      System.out.println("TBD");
    }

  }

}