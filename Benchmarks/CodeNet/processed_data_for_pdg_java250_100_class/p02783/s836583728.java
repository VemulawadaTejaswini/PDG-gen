public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int A = sc.nextInt();
    System.out.println((int) (Math.ceil(1.0 * H / A)));
  }
}
