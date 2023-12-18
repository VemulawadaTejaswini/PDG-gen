class Main {
  private static BufferedReader buf;
  public static void main(String[] args) throws IOException {
    buf = new BufferedReader(new InputStreamReader(System.in));
    String[] s;
    String str = buf.readLine();
    s = str.split(" ", 0);
    int[] inp = new int[3];
    for (int i = 0; i < 3; i++) inp[i] = Integer.parseInt(s[i]);
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        if (inp[j] > inp[j+1]) {
          int tmp = inp[j];
          inp[j] = inp[j+1];
          inp[j+1] = tmp;
        }
      }
    }
    System.out.println(inp[0]+" "+inp[1]+" "+inp[2]);
  }
}
