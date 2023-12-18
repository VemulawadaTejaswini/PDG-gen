public class Main {
  public static void main(String[] args) throws IOException {
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
      String[] numbers = reader.readLine().split(" ");
      int h = Integer.parseInt(numbers[0]);
      int w = Integer.parseInt(numbers[1]);
      int a = h * w;
      int c = (h*2) + (w*2);
      System.out.println(String.format("%s %s", a, c));
    }
  }
}
