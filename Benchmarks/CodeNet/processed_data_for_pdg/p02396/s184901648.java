public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int i = 1;
    int x = s.nextInt();
    while (x != 0) {
      System.out.println("Case " + i + ": " + x);
      x = s.nextInt();
      i++;
    }
  }
}
