import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(scanner.nextInt());
        }
        int result = 0;
        for (int i = 0; i<N; i++) {
            for (int j = 0; j<N; j++) {
                for (int k=j; k<N; k++) {
                    if (j == k) {
                        continue;
                    }
                    if (i == j || i == k) {
                        continue;
                    }
                    if (list.get(j) == list.get(k)) {
                        result++;
                    }
                }
            }
            System.out.println(result);
            result = 0;
        }
    }
}