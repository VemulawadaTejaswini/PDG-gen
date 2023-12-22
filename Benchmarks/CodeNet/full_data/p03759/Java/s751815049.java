public class Main {
  public static void main(String[] args) {
    int a = new java.util.Scanner(System.in).nextInt();
    int b = new java.util.Scanner(System.in).nextInt();
    int c = new java.util.Scanner(System.in).nextInt();

    if (b - a == c - b) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}