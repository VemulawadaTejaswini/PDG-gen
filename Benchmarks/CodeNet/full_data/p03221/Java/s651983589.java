import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    static class City {
        public int prefecture;
        public int year;
        public int id = 1;

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

        for (int i = 0; i < M; i++) {
            City city = new City(scanner.nextInt(), scanner.nextInt());
            for (City city2 : cityList) {
                if (city2.prefecture == city.prefecture)
                    if (city.year < city2.year)
                        city2.id++;
                    else if (city.year > city2.year)
                        city.id++;
            }
            cityList.add(city);
        }

        for (City city : cityList)
            System.out.println(String.format("%06d%06d", city.prefecture, city.id));
    }
}