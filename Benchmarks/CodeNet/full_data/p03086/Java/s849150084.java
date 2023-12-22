import java.util.*;

public class Main {
  public static void main(String[] args) {
    String text = new Scanner(System.in).nextLine();
    
    int length = 0;
    for (int ix = 0; ix < text.length(); ix++) {
	  for (int check = ix; check < text.length(); check++) {
        if (!isAcgt(text.charAt(check))) break;
        length = Math.max(length, 1 + (check - ix));
      }
    }
    
    System.out.println(length);
  }
            
  static boolean isAcgt(char letter) {
   return letter == 'A'
     || letter == 'C'
     || letter == 'G'
     || letter == 'T';
  }
}