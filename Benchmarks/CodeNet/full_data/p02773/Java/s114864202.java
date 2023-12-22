import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfVotes = scanner.nextInt();

        Map<String, Integer> votes = new HashMap<>();
        int maxValue = 1;
        for (int i = 0; i < numberOfVotes; i++) {
            String currentVote = scanner.next();
            if (!votes.containsKey(currentVote)) {
                votes.put(currentVote, 1);
            } else {
                int currentValue = votes.get(currentVote);
                int newValue = ++currentValue;
                if (newValue > maxValue) {
                    maxValue = newValue;
                }
                votes.replace(currentVote, newValue);
            }
        }

        final int comparable = maxValue;
        List<String> answer = votes.entrySet().stream().filter(entry -> Objects.equals(entry.getValue(), comparable)).map(Map.Entry::getKey).collect(Collectors.toList());
        answer.sort(Comparator.naturalOrder());

        for (String answ : answer) {
            System.out.println(answ);
        }
    }
}