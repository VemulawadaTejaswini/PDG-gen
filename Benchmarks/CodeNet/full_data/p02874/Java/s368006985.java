import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Problem[] problems = new Problem[n];
        for (int j = 0; j < n; j++) {
            int l = in.nextInt();
            int r = in.nextInt();
            problems[j] = new Problem(l, r);
        }
        Arrays.sort(problems);
        List<Problem> remProblems = new ArrayList<>(n);
        boolean[] isRemProblem = new boolean[n];
        int maxL = 0;
        for (int j = 0; j < n; j++) {
            Problem problem = problems[j];
            if (problem.l > maxL) {
                isRemProblem[j] = true;
                maxL = problem.l;
                remProblems.add(problem);
            }
        }
        int answer = 0;
        for (int j = 0; j < n; j++) {
            if (!isRemProblem[j]) {
                Problem problem = problems[j];
                answer = Math.max(answer, problem.r - problem.l + 1);
            }
        }
        answer += Math.max(0, remProblems.get(0).r - remProblems.get(remProblems.size() - 1).l + 1);
        for (int j = 0; j < remProblems.size() - 1; j++) {
            answer = Math.max(
                    answer,
                              Math.max(0, remProblems.get(0).r - remProblems.get(j).l + 1)
                            + Math.max(0, remProblems.get(j + 1).r - remProblems.get(remProblems.size() - 1).l + 1));
        }
        for (int j = 1; j < remProblems.size() - 1; j++) {
            Problem problem = remProblems.get(j);
            answer = Math.max(answer, problem.r - problem.l + 1 + Math.max(0, remProblems.get(0).r - remProblems.get(remProblems.size() - 1).l + 1));
        }
        System.out.println(answer);
    }

    static class Problem implements Comparable<Problem> {
        final int l;
        final int r;

        Problem(int l, int r) {
            this.l = l;
            this.r = r;
        }

        @Override
        public int compareTo(Problem o) {
            if (r != o.r) {
                return r - o.r;
            } else {
                return o.l - l;
            }
        }
    }
}
