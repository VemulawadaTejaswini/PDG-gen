public class Main{
  public static void main(String args[])
  {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int area= a * b;
    int c = a + b;
    int perimeter = 2 * c;
    System.out.println(area + " " + perimeter);
  }
}
