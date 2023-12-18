public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b, c;
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    if (a > b) {
      if (c > a) {
        System.out.printf("%d %d %d", b, a, c);
      } else if (c < b) {
        System.out.printf("%d %d %d", c, b, a);
      } else {
        System.out.printf("%d %d %d", b, c, a);
      }
    } else {
      if (c > b) {
        System.out.printf("%d %d %d", a, b, c);
      } else if (c < a) {
        System.out.printf("%d %d %d", c, a, b);
      } else {
        System.out.printf("%d %d %d", a, c, b);
      }
    }
    System.out.printf("\n");
    sc.close();
  }
}
