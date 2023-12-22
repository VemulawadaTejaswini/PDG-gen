import java.util.Scanner;

public class MainA {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();

    String r = s.replaceAll("0", "");

    System.out.println(r.length());

  }

}