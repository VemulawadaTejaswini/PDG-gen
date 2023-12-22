import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    s.nextInt();
    String str = s.next();
    int totalLength = str.length();
    str = str.replaceAll("R", "");
    int blue = str.length();
    int red = totalLength - blue;
    System.out.println(red > blue ? "Yes" : "No");
  }
}
