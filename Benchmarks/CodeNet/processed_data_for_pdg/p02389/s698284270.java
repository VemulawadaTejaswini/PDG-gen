public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int w = scan.nextInt();
    int h = scan.nextInt();
    System.out.printf("%d %d\n", w*h, 2*(w+h));
  }
}
