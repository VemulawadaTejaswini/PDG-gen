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

      int maxNo = 0;
      for(int i=0; i<m; i++) {
        city2[i].no = ++p[city2[i].p];
        if(maxNo < city2[i].no) maxNo = city2[i].no;
      }

      // String no;
      StringBuilder buf1 = new StringBuilder();
      StringBuilder buf2 = new StringBuilder();
      String[] aP = new String[n+1];
      for(int i=1; i<n+1; i++) {
        buf1.append(i);
        for(int j=buf1.length(); j<6; j++)
          buf2.append("0");
        buf2.append(buf1);
        aP[i] = buf2.toString();
        buf1.setLength(0);
        buf2.setLength(0);
      }
      String[] aNo = new String[maxNo+1];
      for(int i=1; i<maxNo+1; i++) {
        buf1.append(i);
        for(int j=buf1.length(); j<6; j++)
          buf2.append("0");
        buf2.append(buf1);
        aNo[i] = buf2.toString();
        buf1.setLength(0);
        buf2.setLength(0);
      }
      for(int i=0; i<m; i++) {
        // no = String.format("%06d%06d", city[i].p,city[i].no);
        buf2.append(aP[city[i].p])
          .append(aNo[city[i].no])
          .append("\n");
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