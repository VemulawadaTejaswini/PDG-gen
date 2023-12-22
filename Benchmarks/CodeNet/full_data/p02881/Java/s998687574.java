

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Data {
    double x;
    double y;

    Data(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance() {
        return this.x + this.y;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();
        int n_sq = (int) Math.sqrt(n) + 1;

        List<Data> list = new ArrayList<>();
        for (double i = 0; i < n_sq; i++) {
            if (n % i == 0) {
                Data data = new Data(i, n / i);
                list.add(data);
            }
        }

        double distance = 1 + n;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getDistance() < distance) {
                distance = list.get(i).getDistance();
            }
        }

        System.out.println((long) distance - 2);

        sc.close();
    }
}