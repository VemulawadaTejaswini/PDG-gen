import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String strs[] = br.readLine().split(" ");
    String s = br.readLine();
    int N = Integer.parseInt(strs[0]), Q = Integer.parseInt(strs[1]);
    int index = 1;
    int[] ac = new int[s.length() + 1];
    for (int i = 0; i < s.length(); i++) {
      if (i - 1 >= 0 && 'A' == s.charAt(i - 1) && 'C' == s.charAt(i)) {
        ac[index] = ac[index - 1] + 1;
      } else {
        ac[index] = ac[index - 1];
      }
      index++;
    }
    for (int i = 0; i < Q; i++) {
      String[] str = br.readLine().split(" ");
      int start = Integer.parseInt(str[0]), end = Integer.parseInt(str[1]);
      System.out.println(ac[end] - ac[start]);
    }
  }
}
