package abc113.c;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();

        City[] cities = new City[m];
        for (int i = 0; i < m; i++) {
            int prefecture = scanner.nextInt();
            int year = scanner.nextInt();
            cities[i] = new City(i, prefecture, year);
        }
        Arrays.sort(cities);
        cities[0].order = 1;
        int order = 1;
        for (int i = 1; i < m; i++) {
            if (cities[i - 1].prefecture != cities[i].prefecture) {
                cities[i].order = 1;
                order = 1;
            } else {
                cities[i].order = ++order;
            }
        }

        Arrays.sort(cities, Comparator.comparingInt(a -> a.index));
        for (int i = 0; i < m; i++) {
            System.out.println(String.format("%06d", cities[i].prefecture) + String.format("%06d", cities[i].order));
        }
    }

    static class City implements Comparable<City> {
        int index;
        int prefecture;
        int year;
        int order;

        City(int index, int prefecture, int year) {
            this.index = index;
            this.prefecture = prefecture;
            this.year = year;
        }

        @Override
        public int compareTo(City o) {
            if (this.prefecture != o.prefecture) {
                return this.prefecture - o.prefecture;
            }
            return this.year - o.year;
        }
    }
}
