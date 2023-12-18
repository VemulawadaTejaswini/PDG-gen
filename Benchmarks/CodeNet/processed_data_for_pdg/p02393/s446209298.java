public class Main {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int a = scan.nextInt();
      int b = scan.nextInt();
      int c = scan.nextInt();
      if (b < a) {
         a = a + b;
         b = a - b;
         a = a - b;
      }
      if (c < a) {
         a = a + c;
         c = a - c;
         a = a - c;
      }
      if (c < b) {
         b = b + c;
         c = b - c;
         b = b - c;
      }
      System.out.println(a + " " + b + " " + c);
   }
}
