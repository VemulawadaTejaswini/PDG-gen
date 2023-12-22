public class Main {
  public static void main(String[] args) {
    int N = new java.util.Scanner(System.in).nextInt();
    if (N.intAt(0) == 7 || N.intAt(1) == 7 || N.intAt(2) == 7) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
