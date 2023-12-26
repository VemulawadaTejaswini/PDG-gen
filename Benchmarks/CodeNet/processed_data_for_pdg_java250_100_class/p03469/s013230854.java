public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = in.readLine();
    System.out.println(s.substring(0,3) + "8" + s.substring(4,10));
  }
}
