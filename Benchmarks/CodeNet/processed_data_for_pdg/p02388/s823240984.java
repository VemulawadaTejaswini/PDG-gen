public class Main {
 public static void main(String[] args) throws Exception {
  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  int value;
  value = Integer.parseInt(in.readLine());
  System.out.println(value*value*value);
  in.close();
 }
}
