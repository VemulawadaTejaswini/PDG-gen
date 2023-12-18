public class Main {
  public static void main(String[] args) {
    try (
      Scanner sc = new Scanner(System.in);
      PrintWriter pw = new PrintWriter(System.out)) {
      int n = 1;
      while (true) {
        int x = sc.nextInt();
        if (x == 0) break;
        pw.append("Case " + n++ + ": " + x + "\n");
      }
      pw.flush();
    }
  }
}
