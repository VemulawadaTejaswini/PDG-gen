import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        int M = Integer.parseInt(scanner.next());

        List<Integer> xList = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            int topX = Integer.parseInt(scanner.next());
            xList.add(topX);
        }
        scanner.close();

        xList.sort(Comparator.naturalOrder());

        List<Integer> diffList = new ArrayList<>();
        for (int i = 0; i < M - 1; i++) {
            int diff = Math.abs(xList.get(i) - xList.get(i + 1));
            diffList.add(diff);
        }

        diffList.sort(Comparator.reverseOrder());

        for (int i = 0; i < N - 1; i++) {
            diffList.set(i, 0);

            if (i == M - 1) {
                break;
            }
        }

        int sum = 0;
        for (int diff : diffList) {
            sum += diff;
        }

        System.out.println(sum);
    }
}
