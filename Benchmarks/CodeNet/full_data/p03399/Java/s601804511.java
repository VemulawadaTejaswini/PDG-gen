import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();

    int min_ab = a;
    int min_cd = c;

    min_ab = Math.min(a,b);
    min_cd = Math.min(c,d);

    System.out.println(min_ab+min_cd);
  }

}
