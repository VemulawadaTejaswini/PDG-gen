public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String[] whStr = reader.readLine().split(" ");
    int w = Integer.parseInt(whStr[0]);
    int h = Integer.parseInt(whStr[1]);
    System.out.println((w * h) + " " + (w * 2 + h * 2));
  }
}
