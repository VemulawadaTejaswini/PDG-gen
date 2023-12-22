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
      // int cityP[] = new int[m];
      // int cityY[] = new int[m];
      City[] city = new City[m];
      int[] p = new int[n+1];

      int maxP = 0;
      int x,y;
      for(int i=0; i<m; i++) {
        lns = in.readLine().split(" ");
        x = Integer.parseInt(lns[0]);
        y = Integer.parseInt(lns[1]);
        city[i] = new City(x, y);
        city[i].s = i;
      }

      Arrays.parallelSort(city, new Comparator<City>() {
        public int compare(City a, City b) {
          if(a.y == b.y) return 0;
          return a.y > b.y ? 1 : -1;
        }
      });

      Arrays.fill(p, 1);
      String no;
      for(int i=0; i<m; i++) {
        city[i].no = p[city[i].p]++;
      }

      Arrays.parallelSort(city, new Comparator<City>() {
        public int compare(City a, City b) {
          return a.s - b.s;
        }
      });
      
      for(int i=0; i<m; i++) {
        no = String.format("%06d%06d", city[i].p,city[i].no);
        out.println(no);
      }
      out.flush();
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
  class City {
    int s;
    int p;
    int y;
    int no;

    public City(int p, int y) {
      this.p = p;
      this.y = y;
    }
  }
}