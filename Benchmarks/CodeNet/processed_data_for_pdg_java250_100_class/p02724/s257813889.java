public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextInt();
    long a = N / 500;
    N %= 500;
    long b = N / 5;
    System.out.println(1000 * a + (5 * b));
  }
}
