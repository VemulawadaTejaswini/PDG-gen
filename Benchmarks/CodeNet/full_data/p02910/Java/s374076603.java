import java.util.Scanner;

public class Main {
  
  	private final static Scanner sc = new Scanner(System.in);
    public static void main (String [] args) {
      boolean klappts = true;
      String S = sc.next();
      int N = S.length();
      for(int i = 0; i < N; i++) {
      	if((i % 2 == 0 && S.charAt(i) == 'L') || (i % 2 == 1 && S.charAt(i) == 'R')) {
          klappts = false;
          break;
        }
      }
      if (klappts) {
        System.out.println("Yes");
      } else  {
        System.out.println("No");
      }
   }
}