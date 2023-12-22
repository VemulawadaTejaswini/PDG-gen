import java.util.Scanner;
import java.lang.String;

public class Main {
  
  public static void main (String[] arg) {
    Scanner sc = new Scanner(System.in);
    String tcdSequence = sc.next();
    sc.close();
	int tdcLength = tcdSequence.length();
    char[] acdSequence = new char[tdcLength];
    for (int i = 0; i < acdSequence.length; i++) {
      if (i % 2 == 0) {
        acdSequence[i] = 'g';
      } else {
        acdSequence[i] = 'p';
      }
    }
    
    int acdScore = 0;
    for (int k = 0; k < tcdSequence.length(); k++) {
      if ((tcdSequence.charAt(k) == 'g') && (acdSequence[k] == 'p')) {
        acdScore++;
      } else if ((tcdSequence.charAt(k) == 'p') && (acdSequence[k] == 'g')) {
        acdScore--;
      }
    }
    
    System.out.println(acdScore);
  }
}
