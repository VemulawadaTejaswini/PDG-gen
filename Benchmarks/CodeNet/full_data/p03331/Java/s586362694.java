import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    while (input.hasNext()) {
      int N = input.nextInt();
      int halfN = N / 2;
      int minSum = Integer.MAX_VALUE;
      
      for (int i = 1; i <= halfN; ++i) {
          minSum = Math.min(minSum, digitSum(i) + digitSum(N - i));
      }

      System.out.println(minSum);
    }
  }

  private static int digitSum (int n) {
    int digitSum = 0;
    
    while (n > 0){
      digitSum += n % 10;
      n /= 10;
    }
    
    return digitSum;
  }
}