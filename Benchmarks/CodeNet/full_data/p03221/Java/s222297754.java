import java.util.Comparator;
import java.util.stream.IntStream;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int[] c = new int[scanner.nextInt()];
        IntStream.range(0, scanner.nextInt())
                .mapToObj(i -> new City(scanner.nextInt(), scanner.nextInt(), i))
                .sorted(Comparator.comparingInt(city -> city.y))
                .peek(city -> city.o = ++c[city.p - 1])
                .sorted(Comparator.comparingInt(city -> city.i))
                .forEach(city -> System.out.println(String.format("%06d%06d", city.p, city.o)));
    }

    static class City {
        int p, y, o = 1, i;

        City(int p, int y, int i) {
            this.p = p;
            this.y = y;
            this.i = i;
        }
    }
}