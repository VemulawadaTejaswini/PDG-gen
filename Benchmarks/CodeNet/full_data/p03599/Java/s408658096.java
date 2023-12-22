import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int c = Integer.parseInt(sc.next());
    int d = Integer.parseInt(sc.next());
    int e = Integer.parseInt(sc.next());
    int f = Integer.parseInt(sc.next());

    double maxConc = 0;
    int ansAll = a*100;
    int ansSugar = 0;
    int ansa = 0;
    int ansb = 0;
    int ansc = 0;
    int ansd = 0;

    for (int ai = 0; (ai * 100) <= f; ai += a) {
      double conc = 0;
      for (int bi = 0; (bi * 100) <= f - (ai * 100); bi += b) {
        loop: for (int ci = 0; ci <= f - (ai * 100) - (bi * 100); ci += c) {
          for (int di = 0; di <= f - (ai * 100) - (bi * 100) - ci; di += d) {
            if ((ai + bi) * 100 + ci + di > f) {
              break;
            } else if ((ai + bi) * e < ci + di) {
              break;
            } else if (ai + bi == 0) {
              break loop;
            } else {
              conc = (double) (100 * (ci + di)) / ((ai + bi) * 100 + ci + di);
              if (conc > maxConc) {
                maxConc = conc;
                ansAll = (ai + bi) * 100 + ci + di;
                ansSugar = ci + di;
                // ansa = ai;
                // ansb = bi;
                // ansc = ci;
                // ansd = di;
              }
            }
          }
        }
      }
    }

    System.out.println(ansAll + " " + ansSugar);
//    System.out.println(ansa + " " + ansb + " " + ansc + " " + ansd);
    sc.close();
  }

}
