public class Main {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int a = sc.nextInt();
 int b = sc.nextInt();
 int c = sc.nextInt();
 if (a < b) {
  if (b < c) {
   System.out.printf("%d %d %d", a, b, c);
   System.out.println();
  } else if (a < c) {
  System.out.printf("%d %d %d", a, c, b);
   System.out.println();
  } else {
  System.out.printf("%d %d %d", c, a, b);
   System.out.println();
  }
 }
 else {
  if (a < c) {
   System.out.printf("%d %d %d", b, a, c);
   System.out.println();
  }
  else if (b < c) {
  System.out.printf("%d %d %d", b, c, a);
  System.out.println();
  }
  else {
  System.out.printf("%d %d %d", c, b, a);
  System.out.println();
  }
 }
}
}
