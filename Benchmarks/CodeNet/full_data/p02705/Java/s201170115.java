impot java.uti.Scanner;
class A {
  public static void main(String args[]) {
	Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    double ans;
    ans = Math.PI * r * r;
    System.out.println(ans);
  }
}