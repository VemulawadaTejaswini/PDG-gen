public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    int j = sc.nextInt();
    int c = 0;
    if ((j - 1) % (i - 1) == 0) {
      c = (j - 1) / (i - 1);
    } else {
      c = (j - 1) / (i - 1) + 1;
    }
    System.out.println(c);
  }
}
