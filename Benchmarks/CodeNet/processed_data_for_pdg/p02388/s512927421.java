class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int ans = 1;
    for (int i=0; i<3; i++) {
      ans = ans*x;
    }
    System.out.printf("%d\n", ans);
  }
}
