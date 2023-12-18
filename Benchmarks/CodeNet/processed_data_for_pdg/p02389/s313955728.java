public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int height = Integer.parseInt(sc.next());
    int width = Integer.parseInt(sc.next());
    System.out.println((height * width) + " " + (2 * height + 2 * width));
  }
}
