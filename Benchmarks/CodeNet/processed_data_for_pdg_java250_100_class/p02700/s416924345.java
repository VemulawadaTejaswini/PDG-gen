public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    boolean takahashi = true;
    while (a > 0 && c > 0) {
      if (takahashi) {
        c -= b;
      } else {
        a -= d;
      }
      takahashi = !takahashi;
    }
    if (c <= 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  } 
}
