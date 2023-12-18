public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] inputs = br.readLine().split(" ");
    int a = Integer.parseInt(inputs[0]), b = Integer.parseInt(inputs[1]);
    if (a == b) {
      System.out.println("a == b");
    } else if (a > b) {
      System.out.println("a > b");
    } else {
      System.out.println("a < b");
    }
  }
}
