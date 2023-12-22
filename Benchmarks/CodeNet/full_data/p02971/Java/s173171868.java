import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        Map<Integer, Integer> A = new LinkedHashMap<>();
        for (int i = 0; i < N; i++) {

            A.put(i, Integer.parseInt(scanner.nextLine()));
        }

        Map<Integer, Integer> sorted = new LinkedHashMap<>(A);
        sorted.entrySet().stream().sorted(java.util.Collections.reverseOrder(java.util.Map.Entry.comparingByValue()));

        for (int i = 0; i < N; i++) {

            int target = sorted.get(i);

            for (Map.Entry<Integer, Integer> s : sorted.entrySet()) {

                if (s.getValue() >= target && s.getKey() != i) {
                    System.out.println(s);
                    break;
                }
            }

        }

        scanner.close();

    }

}
