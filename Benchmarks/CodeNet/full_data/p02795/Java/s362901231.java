import java.util.*;
class Solution {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int h = in.nextInt();
    int w = in.nextInt();
    int n = in.nextInt();
    System.out.println((int)Math.ceil((double) n / Math.max(h, w)));
  }
}
