import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    static int N;
    static int[] s;
    static int[] p;

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        s = new int[N];
        p = new int[N];
        PriorityQueue<Restaurant> queue = new PriorityQueue<>();
        for(int i = 0; i < N; i++) {
            Restaurant restaurant = new Restaurant(i + 1, scanner.next(), scanner.nextInt());
            queue.add(restaurant);
        }

        scanner.close();

        while (!queue.isEmpty()) {
            Restaurant r = queue.poll();
            System.out.println(r.id);
        }

    }
}

class Restaurant implements Comparable<Restaurant>{
    public int id;
    public String city;
    public int point;

    public Restaurant(int id, String city, int point) {
        this.id = id;
        this.city = city;
        this.point = point;
    }

    @Override
    public int compareTo(Restaurant o) {
        int cityName = this.city.compareToIgnoreCase(o.city);

        if(cityName == 0) {
            if(this.point > o.point) {
                return -1;
            } else if (this.point < o.point) {
                return 1;
            } else {
                return 0;
            }
        }

        return this.city.compareToIgnoreCase(o.city);
    }
}