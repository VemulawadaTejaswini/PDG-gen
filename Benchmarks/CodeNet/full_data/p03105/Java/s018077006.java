import java.util.*;

public class Main {
  public static void main(String[] args) {
    String line = new Scanner(System.in).nextLine();
    int zeros = 0;
    int ones = 0;
    for (int ix = 0; ix < line.length(); ix++) {
      if (line.charAt(ix) == '0') {
          zeros++;
        } else if (line.charAt(ix) == '1') {
          ones++;
        }
    }
    
    System.out.println(2 * Math.min(zeros, ones));
  }
}
