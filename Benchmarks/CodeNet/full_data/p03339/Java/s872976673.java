import java.util.Scanner;

public class Main {
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    
    while (input.hasNext()) {
      int N = input.nextInt();
      String S = input.next();
      
      int countE = 0;
      for (int i = 0; i < S.length(); ++i) {
        if (S.charAt(i) == 'E') {
          ++countE;
        }
      }
      
      int currentW = 0;
      int minChange = Integer.MAX_VALUE;
      for (int i = 0; i < S.length(); ++i) {
        if (S.charAt(i) == 'E') {
          --countE;
        }

        int currentChange = currentW + (S.length() - i - 1 - countE);

        if (S.charAt(i) == 'W') {
          --currentChange;
          ++currentW;
        }
        
        minChange = Math.min(minChange, currentChange);
      }

      System.out.println(minChange);
    }
  }
}