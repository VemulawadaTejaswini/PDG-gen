import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String s = in.readLine();
    in.close();
    String ans = "";
    
    for(int i = 0; i < s.length(); i++) {
      int count = (s.charAt(i)-'A' + n) % 26;
      ans += String.valueOf((char)('A' + count));
    }
    
    System.out.println(ans);
  }
}