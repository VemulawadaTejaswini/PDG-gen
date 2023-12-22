import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt(); int B = sc.nextInt(); int numOfPalindromic = 0;

      for(; A<=B; A++) if ((A/10000 == A%10) && ((A/1000)%10 == (A/10)%10)) numOfPalindromic++;
      System.out.println(numOfPalindromic);
    }
}