import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        PriorityQueue<City>[] queue = new PriorityQueue[N + 1];

        for (int i = 0; i <= N; i++) {
            queue[i] = new PriorityQueue<>(Collections.reverseOrder());
        }

        for (int i = 0; i < M; i++) {
            int p = scanner.nextInt();
            int y = scanner.nextInt();

            queue[p].offer(new City(i, p, y));
        }

        PriorityQueue<NewCity> newCities = new PriorityQueue<>();
        for (int i = 1; i <= N; i++) {
            while(!queue[i].isEmpty()) {
                City c = queue[i].poll();
                StringBuilder sb = new StringBuilder();

                String id = String.valueOf(c.prefectureId);
                for(int j = 0; j < 6 - id.length(); j++){
                    sb.append("0");
                }
                sb.append(id);

                String size = String.valueOf(queue[i].size() + 1);
                for(int j = 0; j < 6 - size.length(); j++){
                    sb.append("0");
                }
                sb.append(size);

                newCities.add(new NewCity(c.id, sb.toString()));
            }
        }

        while (!newCities.isEmpty()) {
            NewCity c = newCities.poll();
            System.out.println(c.code);
        }
    }
}

class NewCity implements Comparable<NewCity> {
    public int id;
    public String code;

    public NewCity(int id, String code) {
        this.id = id;
        this.code = code;
    }

    @Override
    public int compareTo(NewCity c) {
        if(this.id > c.id) {
            return 1;
        } else if(this.id < c.id) {
            return -1;
        } else {
            return 0;
        }
    }
}

class City implements Comparable<City> {
    public int id;
    public int prefectureId;
    public int born;

    public City(int id, int prefectureId, int born) {
        this.id = id;
        this.prefectureId = prefectureId;
        this.born = born;
    }

    @Override
    public int compareTo(City c) {
        if(this.born > c.born) {
            return 1;
        } else if(this.born < c.born) {
            return -1;
        } else {
            return 0;
        }
    }
}
