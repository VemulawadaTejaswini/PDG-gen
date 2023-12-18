public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = 1;
    int x = sc.nextInt();
    while (x != 0) {
      System.out.println("Case " + n + ": " + x);
      n++;
      x = sc.nextInt();
    }
  }
}
