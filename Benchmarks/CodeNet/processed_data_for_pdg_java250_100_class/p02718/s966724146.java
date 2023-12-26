public class Main {
  public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int n = in.nextInt();
    int m = in.nextInt();
    int[] a = new int[n];
    double sum = 0;
    for (int i = 0; i < n; ++i) {
      a[i] = in.nextInt();
      sum += a[i];
    }
    Arrays.sort(a);
    double threshold = sum / (4 * (double)m);
    int idx = n - m;
    if ((double)a[idx] < threshold) System.out.println("No");
    else System.out.println("Yes");
  }
}
