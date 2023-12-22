import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] ab = new int[n][2];
        int sum = 0;
        List<Integer> candidate = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            ab[i][0] = scanner.nextInt();
            ab[i][1] = scanner.nextInt();
        }

        Arrays.sort(ab, Comparator.comparingInt(a -> a[0]));

        int j = 0;
        for (int i = 1; i <= m; i++) {
            while (ab[j][i] == i) {
                if (ab[j][0] == i) {
                    candidate.add(ab[j][1]);
                    j++;
                } else {
                    break;
                }
            }
            Collections.sort(candidate, Collections.reverseOrder());
            sum += candidate.get(0);
            candidate.remove(0);
        }
        System.out.println(sum);

    }

}

