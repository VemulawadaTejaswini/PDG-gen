import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int N = scn.nextInt();
    int M = scn.nextInt();

    ArrayList<CityInfo> city = new ArrayList<>();
    for (int i = 0; i < M; i++) {
      int P = scn.nextInt();
      int Y = scn.nextInt();

      city.add(new CityInfo(P, Y, i));
    }

    Collections.sort(city, new Comparator<CityInfo>() {
      public int compare(CityInfo c1, CityInfo c2) {
        if (c1.prefNo < c2.prefNo) {
          return -1;
        } else if (c1.prefNo > c2.prefNo) {
          return 1;

        } else {
          return (c1.year > c2.year) ? 1 : -1;
        }
      }
    });

    int prevPref = city.get(0).prefNo;
    int serialNo = 1;
    for (CityInfo info : city) {
      if (info.prefNo != prevPref) {
        serialNo = 1;
        prevPref = info.prefNo;
      }
      info.setID(String.format("%06d%06d", info.prefNo, serialNo));

      serialNo++;
    }

    Collections.sort(city, new Comparator<CityInfo>() {

      public int compare(CityInfo c1, CityInfo c2) {
        return (c1.order > c2.order) ? 1 : -1;
      }
    });

    for (CityInfo info : city) {
      System.out.println(info.getID());
    }

  }

  private static class CityInfo {
    private int prefNo;
    private int year;
    private int order;
    private String ID;

    CityInfo(int P, int Y, int i) {
      this.prefNo = P;
      this.year = Y;
      this.order = i;
    }

    private void setID(String ID) {
      this.ID = ID;
    }

    private String getID() {
      return this.ID;
    }

    public String toString() {
      return String.valueOf(prefNo) + " " + String.valueOf(year);

    }
  }

}
