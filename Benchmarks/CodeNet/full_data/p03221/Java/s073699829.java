import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    static class City {
        public int prefecture;
        public int id;
        public int year;

        public City(int prefecture, int year) {
            this.prefecture = prefecture;
            this.year = year;
        }

        public String getIdString() {
            return String.format("%06d%06d", prefecture, id);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<City> cityList = IntStream.range(scanner.nextInt() * 0, scanner.nextInt())
                .mapToObj(i -> new City(scanner.nextInt(), scanner.nextInt()))
                .collect(Collectors.toList());

        cityList.stream()
                .collect(Collectors.groupingBy(city -> city.prefecture, Collectors.toList()))
                .forEach((key, value) -> value.stream()
                        .sorted(Comparator.comparingInt(city -> city.year))
                        .reduce(1, (i, city) -> {
                            city.id = i;
                            return ++i;
                        }, (a, b) -> null));

        cityList.forEach(city -> System.out.println(city.getIdString()));
    }
}