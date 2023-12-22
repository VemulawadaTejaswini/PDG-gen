import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    City[] cities = new City[M];
    List<City>[] cityList = new List[N];
    for (int i = 0; i < N; i++) cityList[i] = new ArrayList<>();
    for (int i = 0; i < M; i++) {
      int P = scanner.nextInt();
      int Y = scanner.nextInt();
      City city = new City(i, Y);
      cityList[P - 1].add(city);
      cities[i] = city;
    }
    for (int i = 0; i < N; i++) {
      cityList[i].sort(Comparator.comparingInt(o -> o.year));
      for (int j = 0; j < cityList[i].size(); j++) {
        cityList[i].get(j).id = String.format("%06d%06d", (i + 1), (j + 1));
      }
    }
    for (int i = 0; i < M; i++) {
      System.out.println(cities[i].id);
    }
  }

  static class City {
    public final int num;
    public final int year;
    public String id;

    City(int num, int year) {
      this.num = num;
      this.year = year;
    }
  }
}
