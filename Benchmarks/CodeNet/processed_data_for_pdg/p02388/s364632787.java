public class Main {
  public static void main(String[] args) throws IOException {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      String line = br.readLine();
      int n = Integer.parseInt(line);
      n = (int) Math.pow(n, 3);
      System.out.println(n);
    }
  }
}
