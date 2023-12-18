class Main {
  public static void main(String[] args) {
    Scanner stdInt = new Scanner(System.in);
    double a, b;
    a = stdInt.nextDouble();
    b = stdInt.nextDouble();
  if (a > b) {
    System.out.println("a > b");
  } else if (a < b) {
    System.out.println("a < b");
  } else {
    System.out.println("a == b");
  }
  }
}
