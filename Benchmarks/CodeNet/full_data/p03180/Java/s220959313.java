import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.Instant;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Instant start = Instant.now();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        int[][] points = new int[count][count];
        for (int i = 0; i < count; ++i) {
            String[] parts = reader.readLine().split(" ");
            for (int j = 0; j < count; ++j) {
                points[i][j] = Integer.parseInt(parts[j]);
            }
        }

//        System.out.println(Instant.now().toEpochMilli() - start.toEpochMilli());

        List<Integer> groups = new ArrayList<>();
        groups.add(0);
        long[] groupScores = new long[1 << count];

        for (int i = 0; i < count; ++i) {
            List<Integer> newGroups = new ArrayList<>(groups.size() * 2);
            for (int group : groups) {
                long score = groupScores[group];
                for (int j = 0; j < i; ++j) {
                    if ((group & (1 << j)) != 0) {
                        score += points[i][j];
                    }
                }
                int newGroup = group | (1 << i);
                groupScores[newGroup] = score;
                newGroups.add(group);
                newGroups.add(newGroup);
            }
            groups = newGroups;
        }

//        System.out.println(Instant.now().toEpochMilli() - start.toEpochMilli());

        ArrayDeque<Step> steps = new ArrayDeque<>(1 << count);
        steps.add(new Step(0, 0, 0));
        long[] splitScores = new long[1 << count];

        while (!steps.isEmpty()) {
            Step step = steps.removeFirst();
            int shifted = 1 << step.pos;
            int firstCool = step.first | shifted;
            int secondCool = step.second | shifted;
            int groupBoth = firstCool | step.second;

            splitScores[groupBoth] = Math.max(
                    splitScores[groupBoth],
                    Math.max(
                            groupScores[firstCool] + splitScores[step.second],
                            groupScores[step.first] + splitScores[secondCool]
                    ));

            if (step.pos + 1 < count) {
                steps.addLast(new Step(step.first, step.second, step.pos + 1));
                steps.addLast(new Step(firstCool, step.second, step.pos + 1));
                if (step.first != 0) {
                    steps.addLast(new Step(step.first, secondCool, step.pos + 1));
                }
            }
        }

//        System.out.println(Instant.now().toEpochMilli() - start.toEpochMilli());

        System.out.println(splitScores[(1 << count) - 1]);
    }

    public static class Step {
        int first;
        int second;
        int pos;

        public Step(int first, int second, int pos) {
            this.first = first;
            this.second = second;
            this.pos = pos;
        }
    }
}
