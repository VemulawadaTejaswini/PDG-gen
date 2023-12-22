import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int month = Integer.parseInt(str.substring(0, 2));
    int year = Integer.parseInt(str.substring(2, 4));
    if (month != 0 && year != 0) {
      if (month < 13 && year > 12) {
        System.out.println("MMYY");
      } else if (month > 12 && year < 13) {
        System.out.println("YYMM");
      } else if (month < 13 && year < 13) {
        System.out.println("AMBIGUOUS");
      } else {
        System.out.println("NA");
      }
    } else {
      System.out.println("NA");
    }
  }
}