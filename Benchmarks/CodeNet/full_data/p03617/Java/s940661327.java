import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<Double>> tea = new ArrayList<>();
        double l = 0.25;
        for(int i = 0;i < 4;i++) {
            List<Double> tmp = new ArrayList<>();
            tmp.add(sc.nextDouble());
            tmp.add(tmp.get(0) / l);
            tmp.add(l);
            tea.add(tmp);
            l *= 2d;
        }
        long n = sc.nextLong();

        // 1リットル当たりの値段でソート
        tea.sort((a, b) -> Double.compare(a.get(1), b.get(1)));

        long sum = 0;
        for(int i = 0;i < 4;i++) {
            sum += ((long)(n / tea.get(i).get(2))) * tea.get(i).get(0);
            n -= (((long)(n / tea.get(i).get(2))) * tea.get(i).get(2));
        }

        System.out.println(sum);
    }

}
