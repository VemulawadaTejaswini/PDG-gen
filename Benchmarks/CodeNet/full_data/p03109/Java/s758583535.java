import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    String tbdLine = "2019/05/01";
    String ans = "";
    if (str.compareTo(tbdLine) < 0) {
      ans = "Heisei";
    } else if (str.compareTo(tbdLine) >= 0) {
      ans = "TBD";
    }
    System.out.println(ans);
  }
}