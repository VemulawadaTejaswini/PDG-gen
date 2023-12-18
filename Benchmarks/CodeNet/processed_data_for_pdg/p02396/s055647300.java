public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    for (int i = 1;; i++) {
      int tmp = scan.nextInt();
      if (tmp == 0) {
        break;
      }
      System.out.println("Case " + i + ": " + tmp);
    }
  }
}
