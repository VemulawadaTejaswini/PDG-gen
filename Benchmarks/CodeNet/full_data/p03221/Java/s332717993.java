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
      City[] city = new City[m];
      City[] city2 = new City[m];
      int[] p = new int[n+1];

      int x,y;
      for(int i=0; i<m; i++) {
        lns = in.readLine().split(" ");
        x = Integer.parseInt(lns[0]);
        y = Integer.parseInt(lns[1]);
        city[i] = new City(i, x, y);
        city2[i] = city[i];
      }

      Arrays.parallelSort(city2, new Comparator<City>() {
        public int compare(City a, City b) {
          if(a.y == b.y) return 0;
          return a.y > b.y ? 1 : -1;
        }
      });

      for(int i=0; i<m; i++) {
        city2[i].no = ++p[city2[i].p];
      }

      // String no;
      StringBuilder buf1 = new StringBuilder();
      StringBuilder buf2 = new StringBuilder();
      String[] pre0 = {"000000","00000","0000","000","00","0",""};
      for(int i=0; i<m; i++) {
        // no = String.format("%06d%06d", city[i].p,city[i].no);
        buf1.append(city[i].p);
        // for(int j=buf1.length(); j<6; j++)
        //   buf2.append("0");
        buf2.append(pre0[buf1.length()])
            .append(buf1);
        buf1.setLength(0);
        
        buf1.append(city[i].no);
        // for(int j=buf1.length(); j<6; j++)
        //   buf2.append("0");
        buf2.append(pre0[buf1.length()])
            .append(buf1).append('\n');
        buf1.setLength(0);
        // out.println(no);
      }
      // out.flush();
      System.out.print(buf2);
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

    public City(int s, int p, int y) {
      this.s = s;
      this.p = p;
      this.y = y;
    }
  }
}