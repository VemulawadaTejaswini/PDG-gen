class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int sum = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '+') {
          sum++;
      } else if (str.charAt(i) == '-') {
          sum--;
      } else {
      }
    }
    System.out.println(sum);
  }
}
