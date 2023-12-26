public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    boolean flag = false;
    for (int i = 0; i <= x; i++) {
      if (i * 4 + (x-i) * 2 == y) flag = true;
    }
    System.out.println((flag ? "Yes" : "No"));
  }
}
