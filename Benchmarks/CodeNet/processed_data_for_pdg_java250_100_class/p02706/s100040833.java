public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] head = br.readLine().split(" ");
    int n = Integer.parseInt(head[0]);
    int m = Integer.parseInt(head[1]);
    int sum = 0;
    String[] line = br.readLine().split(" ");
    for (int i = 0; i < m; i++) {
      sum += Integer.parseInt(line[i]);
    }
    System.out.println(Math.max(n - sum, -1));
  }
}
