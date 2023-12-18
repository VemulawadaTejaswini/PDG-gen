public class Main {
  public static void main(String[] args){
    try {
      Scanner scan = new Scanner(System.in);
      String depth = scan.next();
      String width = scan.next();
      int a = Integer.parseInt(depth);
      int b = Integer.parseInt(width);
      int area = a * b;
      int circumference = 2 * (a + b);
      System.out.println(area + " " + circumference);
    } catch (NumberFormatException e) {
      System.out.println("数字が正しくありません");
    }
  }
}
