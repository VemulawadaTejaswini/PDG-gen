public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int ta = (a / d) + (a % d != 0 ? 1 : 0);
    int ao = (c / b) + (c % b != 0 ? 1 : 0);
    if (ta >= ao) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
