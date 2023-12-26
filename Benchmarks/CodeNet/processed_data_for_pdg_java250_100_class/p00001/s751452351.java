public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int[] hillHeights = new int[10];
    for (int i = 0; i < 10; i++)
      hillHeights[i] = Integer.parseInt(reader.readLine());
    Arrays.sort(hillHeights);
    for (int i = 0; i < 3; i++)
      System.out.println(hillHeights[hillHeights.length - i - 1]);
  }
}
