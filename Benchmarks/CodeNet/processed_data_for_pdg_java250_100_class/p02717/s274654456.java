public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str = br.readLine().split(" ");
    System.out.println(str[2] + " " + str[0] + " " + str[1]);
  }
}
