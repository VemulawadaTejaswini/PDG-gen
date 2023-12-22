
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        List<Restaurant> list = new ArrayList<>();
        for (int i=1; i<=N; i++) {
            list.add(new Restaurant(i, scanner.next(), scanner.nextInt()));
        }

        list.sort((o1, o2) -> {
            int compareResult = o1.city.compareTo(o2.city);
            if (compareResult == 0) {
                return o2.score - o1.score;
            }
            return compareResult;
        });

        list.forEach(System.out::println);
    }
    static class Restaurant {
        int index;
        String city;
        int score;
        public Restaurant(int index, String left, int right) {
            this.index = index;
            this.city = left;
            this.score = right;
        }

        @Override
        public String toString() {
            return String.valueOf(index);
        }
    }
}