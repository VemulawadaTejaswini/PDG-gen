import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt() * 100, B = sc.nextInt() * 100, C = sc.nextInt(), D = sc.nextInt(), E = sc.nextInt(), F = sc.nextInt();
    int w, w_a, w_b, s, s_c, s_d;
    int ans_s = 0, ans_sw = 0;
    double density = 0, max_density = 0;

    for(int i = 0; i <= F / A; i++) {
      w_a = i * A;
      for(int j = 0; j <= (F - w_a) / B; j++) {
        w_b = j * B;
        w = w_a + w_b;
        for(int k = 0; k <= (F - w) / C; k++) {
          s_c = k * C;
          for(int l = 0; l <= (F - w - s_c) / D; l++) {
            s_d = l * D;
            s = s_c + s_d;
            if((w / 100) * E >= s && (w + s) != 0) {
              density = 100 * (double)s / (w + s);
              if(density > max_density) {
                ans_s = s;
                ans_sw = s + w;
                max_density = density;
              }
            }
          }
        }
      }
    }
    System.out.println(ans_sw + " " + ans_s);
  }
}
