public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    String A = String.valueOf(a);
    String B = String.valueOf(b);
    int testNumber = Integer.parseInt(A + B);
    boolean squareNumber = false;
    for (int i=1; i<=400; i++) {
      if (testNumber == i * i) {
        squareNumber = true;
      }
    }
    if (squareNumber) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
