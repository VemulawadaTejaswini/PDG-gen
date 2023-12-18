public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] inputs = br.readLine().split(" ");
    Arrays.sort(inputs);
    System.out.println(String.join(" ", inputs));
  }
}
