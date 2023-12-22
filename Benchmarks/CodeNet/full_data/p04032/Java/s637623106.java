import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int len = str.length();
    int start = -1, end = -1;
    for (int i = 0; i < len; i++) {
      if (i + 1 < len && str.charAt(i) == str.charAt(i + 1)) {
        start = i + 1;
        end = i + 2;
      } 
      if (end != -1) {
        break;
      }
    }
    System.out.println(start + " " + end);
  }
}