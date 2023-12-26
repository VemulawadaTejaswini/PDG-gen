public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    if (str.contains("7")) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    } 
  }
}
