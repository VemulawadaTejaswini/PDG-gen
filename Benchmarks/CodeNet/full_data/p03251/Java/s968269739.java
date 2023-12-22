import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int numa = in.nextInt();
    int numb = in.nextInt();
    int capa = in.nextInt();
    int capb = in.nextInt();
    int bora = capa;
    int borb = capb;
    for (int i = 0; i < numa; i++) {
      int num = in.nextInt();
      bora = bora < num ? num : bora;
    }
    for (int i = 0; i < numb; i++) {
      int num = in.nextInt();
      borb = num < borb ? num : borb;
    }
    String ans = bora < borb ? "No " : "";
    System.out.println(ans + "War");
  }
}