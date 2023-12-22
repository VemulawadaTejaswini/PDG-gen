import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String str = in.readLine();
    
    if(str.equals("A"))
      System.out.println("T");
    else if(str.equals("T"))
      System.out.println("A");
    else if(str.equals("G"))
      System.out.println("C");
    else
      System.out.println("G");
  }
}