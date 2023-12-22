import java.util.ArrayList;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        ArrayList<Integer> candleOfsei = new ArrayList<Integer>();
        ArrayList<Integer> candleOfhu = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int j = scanner.nextInt();
            if (j >= 0) {
                candleOfsei.add(j);
            } else {
                candleOfhu.add(j);
            }
        }
        scanner.close();

        int min = Integer.MAX_VALUE;

        if (candleOfsei.size() >= k) {
            min = candleOfsei.get(k - 1);
        }
        if (candleOfhu.size() >= k && -1 * candleOfhu.get(candleOfhu.size() - k) < min) {
            min = -1 * candleOfhu.get(candleOfhu.size() - k);
        }

        for (int numOfhu = 1; numOfhu < k; numOfhu++) {
            int dis = 0;
            int disOfsei = 0;
            int disOfhu = 0;

            if (candleOfsei.size() >= k - numOfhu) {
                disOfsei = candleOfsei.get(k - numOfhu - 1);
            } else {
                break;
            }

            if (candleOfhu.size() >= numOfhu) {
                disOfhu = -1 * candleOfhu.get(candleOfhu.size() - numOfhu);
            } else {
                break;
            }

            if (disOfsei < disOfhu) {
                dis = disOfsei * 2 + disOfhu;
            } else {
                dis = disOfsei + disOfhu * 2;
            }

            if (dis < min) {
                min = dis;
            }

        }
        System.out.println(min);
    }

}
