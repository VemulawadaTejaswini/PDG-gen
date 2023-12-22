import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int phase = sc.nextInt();
        int[] time = new int[phase];
        int[] speed = new int[phase];
        int totalTime = 0;
        for (int i = 0; i < phase; i++) {
            time[i] = sc.nextInt();
            totalTime += time[i];
        }
        for (int i = 0; i < phase; i++) {
            speed[i] = sc.nextInt();
        }
        double distance = solve(time, speed, totalTime);
        System.out.println(distance);
    }

    private static double solve(int[] time, int[] speed, int totalTime) {
        double[] actual = new double[totalTime * 2 + 1];
        int idx = 0;
        for (int i = 0; i < time.length; i++) {
            for (int j = 0; j < time[i]; j++) {
                actual[idx] = speed[i];
                idx++;
                actual[idx] = speed[i];
                idx++;
            }
        }
        actual[0] = 0;
        actual[actual.length - 1] = 0;
        for (int i = 1; i < actual.length; i++) {
            actual[i] = Math.min(actual[i], actual[i - 1] + 0.5);
        }
        for (int i = actual.length - 2; i > 1; i--) {
            actual[i] = Math.min(actual[i], actual[i + 1] + 0.5);
        }
        double distance = 0;
        for (int i = 1; i < actual.length; i++) {
            distance += (actual[i] + actual[i - 1]) / 4;
        }
        return distance;
    }
}
