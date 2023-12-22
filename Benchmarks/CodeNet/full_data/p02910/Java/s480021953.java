
import java.util.Scanner;

public class Main {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] S = sc.next().split("");


    boolean flag = true;
    for (int i = 0; i < S.length; i++) {
      if (i == 0 || i % 2 == 0) {
        if (S[i].equals("R") || S[i].equals("U") || S[i].equals("D")) {
          continue;
        } else {
          flag = false;
          break;
        }
      } else if (i % 2 != 0) {
        if (S[i].equals("L") || S[i].equals("U") || S[i].equals("D")) {
          continue;
      } else {
        flag = false;
        break;
      }
    }

    }
    if (flag)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}


