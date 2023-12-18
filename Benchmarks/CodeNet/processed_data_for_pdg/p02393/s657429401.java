class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b, c, tmp;
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    if (a > b) {
      tmp = a;
      a = b;
      b = tmp;
    }
    if (b > c) {
      tmp = b;
      b = c;
      c = tmp;
    }
    if (a > b) {
      tmp = a;
      a = b;
      b = tmp;
    }
    System.out.println(a +" " +  b + " " + c);
    sc.close();
  }
}
