import java.util.*;

public class C {
  public static int bunkatsu(int h, int w){
    int smin = Integer.MAX_VALUE;
    for (int ha = 1; ha < h; ha++){
      // yoko
      int[] s = new int[3];
      s[0] = ha * w;
      int wb = w/2;
      s[1] = (h-ha)*wb;
      s[2] = (h-ha)*(w-wb);
      Arrays.sort(s);
      int tmp = s[2] - s[0];
      if (tmp < smin) {
        smin = tmp;
      }

      //tate
      // int[] s = new int[3];
      s[0] = ha * w;
      int hb = (h-ha)/2;
      s[1] = hb * w;
      s[2] = (h-ha-hb) * w;
      Arrays.sort(s);
      tmp = s[2] - s[0];
      if (tmp < smin) {
        smin = tmp;
      }

    }
    return smin;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = Integer.parseInt(sc.next());
    int w = Integer.parseInt(sc.next());
    int t1 = bunkatsu(h, w);
    int t2 = bunkatsu(w, h);
    System.out.println(t1 > t2 ? t2 : t1);
  }

}
