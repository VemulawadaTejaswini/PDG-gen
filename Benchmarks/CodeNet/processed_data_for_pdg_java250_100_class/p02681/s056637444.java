public class Main {
  static String s, t;
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);
    s = br.readLine();
    t = br.readLine();
    br.close();
    boolean flag = true;
    int n = s.length();
    int m = t.length();
    flag = s.equals(t.substring(0, n));
    out.println(flag ? "Yes" : "No");
    out.flush();
  }
}
