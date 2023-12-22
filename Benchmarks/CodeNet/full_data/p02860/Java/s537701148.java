import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    String S = sc.next();

    String rp = S.substring(0, 1+S.substring(1).indexOf(S.charAt(0)));

    if (rp.equals("")) {
      System.out.println("No");
      return; 
    }

    for (int i = 0; i < N; i += rp.length()) {
      try {
        if (!rp.equals(S.substring(i, i + rp.length()))) {
          System.out.println("No");
          return;   
        }
      } catch (Exception e) {
        System.out.println("No");
        return; 
      }
    }
    
    System.out.println("Yes");
  }
}