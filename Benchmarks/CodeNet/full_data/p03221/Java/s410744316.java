import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    static class City {
        public int prefecture;
        public int year;
        public int id = 0;

        public City(int prefecture, int year) {
            this.prefecture = prefecture;
            this.year = year;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        int M = scanner.nextInt();
        List<City> cityList = new ArrayList<>();
        for (int i = 0; i < M; i++)
            cityList.add(new City(scanner.nextInt(), scanner.nextInt()));

        List<City> cityListCopy = new ArrayList<>(cityList);
        cityListCopy.sort(Comparator.comparingInt((City city) -> city.prefecture).thenComparingInt(city -> city.year));
        int i = 1, prefecture = 0;
        for (City city : cityListCopy) {
            city.id = prefecture == city.prefecture ? ++i : (i = 1);
            prefecture = city.prefecture;
        }

        for (City city : cityList)
            System.out.println(String.format("%06d%06d", city.prefecture, city.id));
    }
}