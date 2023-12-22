import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int g = sc.nextInt();

    int gap = (g-r) * 2;

    System.out.println(r+gap);
  }

}
