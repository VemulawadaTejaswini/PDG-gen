import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] strs = br.readLine().split(" ");
    int age = Integer.parseInt(strs[0]);
    int money = Integer.parseInt(strs[1]);
    if (age < 13) {
      if (age < 6) {
        System.out.println(0);
      } else {
        System.out.println(money / 2);
      }
    } else {
      System.out.println(money);
    }
  }
}