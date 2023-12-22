import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = in.readLine();
    int s_len = s.length();
    if(s.substring(0,(n-1)/2).equalse(s.substring((n+1)/2,n))) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}