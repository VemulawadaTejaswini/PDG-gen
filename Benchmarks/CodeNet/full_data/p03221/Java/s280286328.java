import java.util.*;

public class Main {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    int N = sc.nextInt(); //県の数
    int M = sc.nextInt(); //市の数

    ArrayList<Integer[]> cities = new ArrayList(M);
    //[0] 市の番号 [1] 県の番号 [2] 年

    for (int i=0; i<M; i++) {
      int p = sc.nextInt();
      int y = sc.nextInt();
      cities.add(new Integer[]{i, p, y});
    }

    cities.sort((x, y) -> {
      if (x[1] == y[1]) {
        return x[2] - y[2];
      } else {
        return x[1] - y[1];
      }
    });

    String[] ids = new String[M];
    int count = 0;
    for (int i=0; i<M; i++) {
      Integer[] c = cities.get(i);
      if (i == 0 || c[1] != cities.get(i-1)[1]) count = 0;
      else count++;
      ids[c[0]] = String.format("%06d", c[1]) + String.format("%06d", count+1);
    }

    for (int i=0; i<M; i++) {
      System.out.println(ids[i]);
    }

  }

}
