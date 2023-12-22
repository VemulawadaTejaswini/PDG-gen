import java.util.Scanner;

class Main {
  public static void main(String args[]) {
        Scanner scanner1 = new Scanner(System.in);
        int H = scanner1.nextInt();
        int W = scanner1.nextInt();
        int h = scanner1.nextInt();
        int w = scanner1.nextInt();
        int x;
        x = H*W+h*w -(h*W+w*H);
        System.out.println(x);
  }
}