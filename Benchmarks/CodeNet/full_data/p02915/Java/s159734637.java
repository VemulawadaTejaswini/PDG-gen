public class main {
public static void main(String[] args) {
  Scanner sc = new Scanner(new File("main.in"));
  PrintWriter pw = new PrintWriter(new File("main.out"));
  int n = sc.nextInt();
  pw.println(n*n*n);
  sc.close();
  pw.close();
}
}