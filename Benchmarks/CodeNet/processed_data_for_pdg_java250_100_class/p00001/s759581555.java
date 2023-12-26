class Main {
  public static void main(String[] args) throws IOException {
    ArrayList<Integer> array = new ArrayList<Integer>();
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    for(int i = 0; i < 10; i++) {
      int x = Integer.valueOf(buf.readLine());
      array.add(x);
    }
    Collections.sort(array);
    Collections.reverse(array);
    for(int i = 0; i < 3; i++) {
      System.out.println(array.get(i));
    }
  }
}
