class Main {
  public static void main(String...args) throws Exception {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    stdin.lines()
      .mapToInt(Integer::parseInt)
      .mapToDouble(v -> Math.pow(v, 3d))
      .mapToInt(v -> (int)v)
      .forEach(out::println);
  }
}
