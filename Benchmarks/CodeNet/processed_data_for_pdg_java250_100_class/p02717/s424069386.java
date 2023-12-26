public class Main{
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(in.readLine());
    int X = Integer.parseInt(st.nextToken());
    int Y = Integer.parseInt(st.nextToken());
    int Z = Integer.parseInt(st.nextToken());
    int tmp = X;
    X = Y;
    Y = tmp;
    tmp = X;
    X = Z;
    Z = tmp;
    System.out.println(X + " " + Y + " " + Z);
  }
}
