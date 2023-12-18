public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int readInt = Integer.parseInt(reader.readLine());
    System.out.println((int) Math.pow(readInt, 3));
  }
}
