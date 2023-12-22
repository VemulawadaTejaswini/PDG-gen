import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] l = scanner.nextLine().trim().split(" ");
        int n = Integer.valueOf(l[0]);
        int m = Integer.valueOf(l[1]);

        Set<Integer> accepted = new HashSet<>();
        Map<Integer, Integer> wrongSubmissions = new HashMap<>();

        for (int i = 0; i < m; i++) {
            String[] submission = scanner.nextLine().trim().split(" ");
            int problem = Integer.valueOf(submission[0]);
            String result = submission[1];

            if ("AC".equalsIgnoreCase(result)) {
                accepted.add(problem);
            } else if (!accepted.contains(problem)) {
                wrongSubmissions.put(problem, wrongSubmissions.getOrDefault(problem, 0) + 1);
            }

            if (accepted.size() == n) {
                break;
            }
        }

        int correct = accepted.size();
        int failed = wrongSubmissions
                .entrySet()
                .stream()
                .filter(e -> accepted.contains(e.getKey()))
                .mapToInt(Map.Entry::getValue)
                .sum();

        System.out.println(correct + " " + failed);
    }
}
