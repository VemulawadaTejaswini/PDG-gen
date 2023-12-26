public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int count = 0;
    count += (X / 500) * 1000;
    X = X % 500;
    count += (X / 5) * 5;
    System.out.println(count);
  }
}
