import java.util.*;

public static class Main() {
  Scanner sc = new Scanner(System.in);
  int H, W, h, w;
  H = sc.nextInt();
  W = sc.nextInt();
  h = sc.nextInt();
  w = sc.nextInt();
  
  return H*W - (h*H + w*W - h*w);
}
