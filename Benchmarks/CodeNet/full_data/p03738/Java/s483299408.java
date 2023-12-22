import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String a = in.readLine();
    String b = in.readLine();
    String result = "";
    if(a.equals(b))
      result = "EQUAL";
    else if(a.length() > b.length())
      result = "GREATER";
    else if(a.length() < b.length())
      result = "LESS";
    else {
      if(a.compareTo(b) < 0)
        result = "LESS";
      else
        result = "GREATER";
    }
    System.out.println(result);
  }
}