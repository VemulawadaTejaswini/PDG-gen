import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String C1 = sc.next();
    StringBuffer C2 = new StringBuffer(sc.next());

    String msg = "NO";
    if(C1.equals(C2.reverse().toString())) msg = "YES";

    System.out.println(msg);

  }
}
