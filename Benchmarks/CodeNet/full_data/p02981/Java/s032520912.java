class Main {
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a = in.nextInt();
    int b = in.nextInt();
    int m = n*a;

    if (m > n) {
      System.out(m);
    } else {
      System.out(n);
    }
  }
}