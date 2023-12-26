public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = in.readLine();
    System.out.println(Integer.parseInt(s.substring(5,7))>4?"TBD":"Heisei");
  }
}
