import java.util.Scanner;

public class Main {
  public static void main (String args[]){
    Scanner input = new Scanner(System.in);
    
    while (input.hasNext()) {
      int N = input.nextInt();
      int[][] countHeadEnd = new int[10][10];
      
      int count = 0;
      for (int i = 1; i <= N; ++i) {
        String strI = Integer.toString(i);
        int firstDigit = strI.charAt(0) - '0';
        int lastDigit = strI.charAt(strI.length() - 1) - '0';
        
        if (firstDigit == lastDigit) {
          ++count;
        }
        
        if (lastDigit != '0') {
          count += countHeadEnd[lastDigit][firstDigit] * 2;
        }
        
        ++countHeadEnd[firstDigit][lastDigit];
      }
      
      System.out.println(count);
    }
  }
}