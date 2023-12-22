import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Eric
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BGuidebook solver = new BGuidebook();
        solver.solve(1, in, out);
        out.close();
    }

    static class BGuidebook {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            List<BGuidebook.City> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(new BGuidebook.City(i + 1, in.next(), in.nextInt()));
            }
            arr.sort((c1, c2) -> c1.city.equals(c2.city) ? c2.score - c1.score : c1.city.compareTo(c2.city));
            for (BGuidebook.City city : arr) {
                out.println(city.id);
            }
        }

        public static class City {
            int id;
            int score;
            String city;

            public City(int id, String city, int score) {
                this.id = id;
                this.score = score;
                this.city = city;
            }

        }

    }
}

