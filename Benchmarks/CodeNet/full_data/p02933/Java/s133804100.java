import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args ){

    Scanner sc = new Scanner(System.in);

    int S = sc.nextInt();
    String T = sc.next();

    System.out.println(S >= 3200 ? T : "red");
  }
}
