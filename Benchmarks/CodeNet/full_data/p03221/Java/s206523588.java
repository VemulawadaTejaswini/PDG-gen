import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
  private static PrintWriter out;

  public static void main(String[] args) {
    Main main = new Main();
    try {
      main.run(args);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void run(String[] arguments) throws Exception {
    MyScanner sc = new MyScanner();
    out = new PrintWriter(new BufferedOutputStream(System.out));
    int N = sc.nextInt(), M = sc.nextInt();

    HashMap<Integer, Prefecture> prefectureHashMap = new HashMap<>();
    for (int i = 0; i < M; i++) {
      int p = sc.nextInt();
      int y = sc.nextInt();
      if (prefectureHashMap.containsKey(p)) {
        prefectureHashMap.get(p).add(new City(i,y));
      } else {
        Prefecture prefecture = new Prefecture(p);
        prefecture.add(new City(i,y));
        prefectureHashMap.put(p, prefecture);
      }
    }

    prefectureHashMap.entrySet().stream().map(Map.Entry::getValue).forEach(Prefecture::allocation);

    TreeSet<City> totalCities = new TreeSet<>(new CityInputComp());
    prefectureHashMap.entrySet().stream()
            .map(Map.Entry::getValue)
            .map(Prefecture::getCities)
            .forEach(totalCities::addAll);
    totalCities.forEach(out::println);
    out.close();
  }

  class Prefecture {
    private int ID;
    private TreeSet<City> cities = new TreeSet<>();

    Prefecture(int id) {
      this.ID = id;
    }

    void add(City city) {
      cities.add(city);
    }

    TreeSet<City> getCities(){
        return cities;
    }

    void allocation() {
      AtomicInteger count = new AtomicInteger();
      for (City city : cities) {
        count.getAndIncrement();
        city.setID(ID, count.get());
      }
    }
  }

  class City implements Comparable<City> {
    private int number;
    private int year;

    private String ID;

    City(int number, int year) {
      this.number = number;
      this.year = year;
    }

    void setID(int prefectureID, int number) {
      ID = String.format("%06d", prefectureID) + String.format("%06d", number);
    }

    @Override
    public String toString() {
      return ID;
    }

    @Override
    public int compareTo(City city) {
      return this.year - city.year;
    }
  }

  class CityInputComp implements Comparator<City> {
      @Override
      public int compare(City o1, City o2) {
          return o1.number - o2.number;
      }
  }

  /*
   * Form: http://codeforces.com/blog/entry/7018
   */
  private class MyScanner {
    BufferedReader br;
    StringTokenizer st;

    MyScanner() {
      br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
      while (st == null || !st.hasMoreElements()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }

    long nextLong() {
      return Long.parseLong(next());
    }

    double nextDouble() {
      return Double.parseDouble(next());
    }

    String nextLine() {
      String str = "";
      try {
        str = br.readLine();
      } catch (IOException e) {
        e.printStackTrace();
      }
      return str;
    }
  }
}
