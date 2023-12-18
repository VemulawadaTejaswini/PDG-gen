public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int testVal = -1;
    int i = 1;
    while ((testVal = sc.nextInt()) != 0) {
      System.out.println(String.format("Case %d: %d", i, testVal));
      i++;
    }
  }
}
