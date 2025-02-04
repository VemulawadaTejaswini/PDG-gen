import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();
        int F = sc.nextInt();
        List<Integer> waterList = new ArrayList<>();
        List<Integer> sugerList = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                int candidate = 100 * A * i + 100 * B * j;
                if (candidate <= F) {
                    waterList.add(candidate);
                }
            }
        }
        waterList = waterList.stream().distinct().collect(Collectors.toList());

        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                int candidate = C * i + D * j;
                if (candidate <= F) {
                    sugerList.add(candidate);
                }
            }
        }
        sugerList = sugerList.stream().distinct().collect(Collectors.toList());
        double max = 0;
        int total = 100 * A, suger = 0;
        for (int wCandidate : waterList) {
            for (int sCandidate : sugerList) {
                if (wCandidate + sCandidate <= F) {
                    double percent = sCandidate * 100.0 / wCandidate;
                    if (percent <= E && percent > max) {
                        max = percent;
                        total = sCandidate + wCandidate;
                        suger = sCandidate;
                    }
                }
            }
        }
        System.out.println(total + " " + suger);
    }
}
