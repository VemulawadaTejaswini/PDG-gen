import java.util.*;
class Main {
  public static void main(String [] args) {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    in.close();
    String ans = "AC"
    int countC = 0;
    if (str.charAt(0) != 'A') ans = "WA";
    if (str.charAt(1) == 'C') ans = "WA";
    if (str.charAt(str.length() - 1) == 'C') ans = "WA";
    for (char c : str.toCharArray()) {
      if (c == 'C') {
        countC++;
      }
      if (countC > 1) {
        ans = "WA";
        break;
      }
    }
    if (countC == 0) {
      ans == "WA";
    }
    System.out.println(ans);
  }
}
    
      
      