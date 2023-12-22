import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {

    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out)) {

      String[] lns = in.readLine().split(" ");
      int n = Integer.parseInt(lns[0]);
      int m = Integer.parseInt(lns[1]);
      int cityP[] = new int[m];
      int cityY[] = new int[m];
      City[] city = new City[m];
      int[] p = new int[m];
      int[] y = new int[m];

      int maxP = 0;
      for(int i=0; i<m; i++) {
        lns = in.readLine().split(" ");
        cityP[i] = Integer.parseInt(lns[0]);
        cityY[i] = Integer.parseInt(lns[1]);
        city[i] = new City(cityP[i], cityY[i]);
        if(maxP < cityP[i]) maxP = cityP[i];
      }

      Arrays.parallelSort(city, new Comparator<City>() {
        public int compare(City a, City b) {
          return a.y - b.y;
        }
      });

      Arrays.fill(p, 1);
      String no;
      for(int i=0; i<m; i++) {
        y[i] = p[city[i].p]++;
      }
      for(int i=0; i<m; i++) {
        no = String.format("%06d%06d", cityP[i],y[i]);
        out.println(no);
      }
      out.flush();
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
  class City {
    int p;
    int y;

    public City(int p, int y) {
      this.p = p;
      this.y = y;
    }
  }
}