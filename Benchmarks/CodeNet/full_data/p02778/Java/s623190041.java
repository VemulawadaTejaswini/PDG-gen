import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = in.readLine();
    StringBuilder ans = new StringBuilder();
    for(int cnt = 1; cnt<=s.length(); cnt++){
      ans.append("x");
    }
    System.out.println(ans.toString());
  }
}