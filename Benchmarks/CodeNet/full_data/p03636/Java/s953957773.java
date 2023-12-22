import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
  public static void main(String[] args) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String str = in.readLine();
    int n = str.length();
    System.out.println("" + str.charAt(0) + (n-2) + str.charAt(n-1));
  }
}