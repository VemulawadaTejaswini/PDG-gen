public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    for (int i = 0; i < M; i++) {
      int ai = sc.nextInt();
      N = N - ai;
    }
    System.out.println(N < 0 ? -1 : N);
  }
}
