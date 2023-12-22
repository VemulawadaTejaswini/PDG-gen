import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {

    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ) {

      String[] lns = in.readLine().split(" ");
      int n = Integer.parseInt(lns[0]);
      int m = Integer.parseInt(lns[1]);
      City[] city = new City[m];
      City[] city2 = new City[m];
      int[] p = new int[n+1];

      int x,y;
      for(int i=0; i<m; i++) {
        lns = in.readLine().split(" ");
        x = Integer.parseInt(lns[0]);
        y = Integer.parseInt(lns[1]);
        city2[i] = city[i] = new City(i, x, y);
      }

      Arrays.parallelSort(city2, new Comparator<City>() {
        public int compare(City a, City b) {
          if(a.y == b.y) return 0;
          return a.y > b.y ? 1 : -1;
        }
      });

      for (City c : city2)
        c.no = ++p[c.p];

      // String no;
      StringBuilder buf = new StringBuilder();
      String[] pre0 = {"000000","00000","0000","000","00","0",""};
      for(int i=0; i<m; i++) {
        // no = String.format("%06d%06d", city[i].p,city[i].no);
        buf.append(pre0[len(city[i].p)])
           .append(city[i].p);

        buf.append(pre0[len(city[i].no)])
           .append(city[i].no)
           .append('\n');
        // out.println(no);
      }
      // out.flush();
      System.out.print(buf);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }

  int len(int n) {
    int i=1;
    for(int j=10; ; i++,j*=10)
      if(n<j) break;
    return i;
  }
  class City {
    int s;
    int p;
    int y;
    int no;

    public City(int s, int p, int y) {
      this.s = s;
      this.p = p;
      this.y = y;
    }
  }
}