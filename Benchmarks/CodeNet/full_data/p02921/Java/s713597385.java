import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = in.readLine();
    String t = in.readLine();
    int cnt = 0;
    if(s.substring(0,1).equals(t.substring(0,1)))
      cnt += 1;
    if (s.substring(1,2).equals(t.substring(1,2)))
      cnt += 1;
    if (s.substring(2,3).equals(t.substring(2,3)))
      cnt += 1;
    System.out.println(cnt);
  }
}