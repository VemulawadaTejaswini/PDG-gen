import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = String.valueOf(n);
    String[] c = s.split("");
    if(c[0].equals(c[1]) || c[1].equals(c[2]) || c[2].equals(c[3])) {
      System.out.println("Bad");
    } else {
      System.out.println("Good");
    }

  }

}
