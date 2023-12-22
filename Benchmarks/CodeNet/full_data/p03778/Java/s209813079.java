import java.util.Scanner;

public class Main {
//  private static boolean isOverlapped(int al, int ar, int bl, int br) {
//      return al < br && ar > bl;
//  }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
//      if (isOverlapped(a, a+w, b, b+w)) {
//          System.out.println(0);
//      } else {
            System.out.println(Math.max(0, Math.abs(a - b) - w));
//      }
    }
}