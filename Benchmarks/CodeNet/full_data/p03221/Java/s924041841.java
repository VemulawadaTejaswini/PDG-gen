import java.util.*;

public class Main {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    int N = sc.nextInt(); //県の数
    int M = sc.nextInt(); //市の数

    ArrayList<Integer[]>[] prefectures = new ArrayList[N]; //[0] 市の番号 [1] 年
    for (int i=0; i<N; i++) {
      prefectures[i] = new ArrayList();
    }

    for (int i=0; i<M; i++) {
      int p = sc.nextInt()-1;
      int y = sc.nextInt();
      prefectures[p].add(new Integer[]{i, y});
    }

    for (int i=0; i<N; i++) {
      Collections.sort(prefectures[i], (x, y) -> x[1] - y[1]);
    }

    String[] ids = new String[M];
    for (int i=0; i<N; i++) {
      for (int j=0; j<prefectures[i].size(); j++) {
        Integer[] city = prefectures[i].get(j);
        ids[city[0]] = String.format("%06d", i+1) + String.format("%06d", j+1);
      }
    }

    for (int i=0; i<M; i++) {
      System.out.println(ids[i]);
    }

  }

}