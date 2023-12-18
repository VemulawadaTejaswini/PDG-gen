class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String[] list = new String[3];
      list[0] = String.valueOf(sc.nextInt());
      list[1] = String.valueOf(sc.nextInt());
      list[2] = String.valueOf(sc.nextInt());
      Arrays.sort(list);
      System.out.println(String.join(" ",  list));
      sc.close();
  }
}
