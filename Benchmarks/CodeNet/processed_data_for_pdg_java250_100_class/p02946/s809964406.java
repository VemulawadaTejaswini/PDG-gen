public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    int X = sc.nextInt();
    StringBuilder sb = new StringBuilder();
    for (int i = X - (K - 1); i <= X + (K - 1); i++ ) {
      sb.append(i).append(' ');
    }
    System.out.println(sb.toString().trim());
  }
}
