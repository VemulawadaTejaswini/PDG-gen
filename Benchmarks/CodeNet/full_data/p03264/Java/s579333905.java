public class Main {
  public static void main(String... a) {
    int k = Integer.parseInt(a);
    int nOdd = k / 2 + k % 2;
    int nEven = k / 2;
    System.out.print(nOdd * nEven);
  }
}
