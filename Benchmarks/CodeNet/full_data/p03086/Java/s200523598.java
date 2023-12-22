import java.util.*;

public class Main {
  private static int getLongest(String str) {
    int maxLength = 0;
    int length = 0;
    for (char c : str.toCharArray()) {
      switch (c) {
        case 'A':
        case 'T':
        case 'C':
        case 'G':
          length++;
          maxLength = Math.max(maxLength, length);
          break;
        default:
          length = 0;
      }
    }
    return maxLength;
  }
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    String in = s.next();
    System.out.println(getLongest(in));
  }
}

