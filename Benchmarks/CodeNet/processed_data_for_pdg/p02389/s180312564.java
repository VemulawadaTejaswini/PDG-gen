class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String aa = scan.next();
    int a = Integer.parseInt(aa);
    String bb = scan.next();
    int b = Integer.parseInt(bb);
    int pie = a * b;
    int syuu = (2 * a) + (2 * b);
    System.out.println(pie + " " + syuu);
  }
}
