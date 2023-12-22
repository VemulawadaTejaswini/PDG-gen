import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    scn.nextLine();
    String s = scn.nextLine();

    System.out.println((a >= 3200) ? s : "red");
  }

}
