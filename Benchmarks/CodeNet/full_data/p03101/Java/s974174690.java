import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H, W, h, w;
    H = sc.nextInt();
    W = sc.nextInt();
    h = sc.nextInt();
    w = sc.nextInt();

    System.out.println(H*W - (h*H + w*W - h*w));
  }
}
