public class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n;
    for (int i = 1; (n = scanner.nextInt()) != 0; ++i) {
      System.out.println("Case " + i + ": " + n);
    }
  }
}
