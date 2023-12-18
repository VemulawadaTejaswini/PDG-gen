public class Main {
  public static void main(String[] args) throws IOException {
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
      String[] numbers = reader.readLine().split(" ");
      int h = Integer.parseInt(numbers[0]);
      int w = Integer.parseInt(numbers[1]);
      System.out.println(String.format("%d %d", (h*w), (h+w)*2));
    }
  }
}
