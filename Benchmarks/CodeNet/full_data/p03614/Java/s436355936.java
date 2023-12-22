
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static int solve(int N, int[] nums) {
        // decrement nums
        for (int i = 0; i < N; i ++) {
            nums[i] --;
        }

        // list up all problematic places
        // list up all score
        LinkedList<Integer> problematics = new LinkedList<>();
        int[] scores = new int[N];
        for (int i = 0; i < N; i ++) {
            if (i == nums[i]) problematics.add(i);
            scores[i] = score(nums, i);  // same with nums[i] + score
        }

        int nSwap = 0;
        long nProbs = problematics.stream().count();
        while (nProbs != 0) {
            int targetInd = problematics.getFirst();
            if (targetInd == 0) {
                swap(nums, 0, 1);
                scores[0] = score(nums, 0);
                scores[1] = score(nums, 1);
            } else if (targetInd == N - 1) {
                swap(nums, N - 2, N - 1);
                scores[N - 2] = score(nums, N - 2);
                scores[N - 1] = score(nums, N - 1);
            } else {
                int leftScore = 1 + nums[targetInd - 1] < targetInd ? - 1 : 1;
                int rightScore = 1 + nums[targetInd + 1] > targetInd ? - 1 : 1;

                if (leftScore > rightScore) {
                    swap(nums, targetInd - 1, targetInd);
                    scores[targetInd - 1] = score(nums, targetInd - 1);
                    scores[targetInd] = score(nums, targetInd);
                } else {
                    swap(nums, targetInd, targetInd + 1);
                    scores[targetInd + 1] = score(nums, targetInd + 1);
                    scores[targetInd] = score(nums, targetInd);
                }
            }

            addRemoveProblems(targetInd, problematics, nums);

            nProbs = problematics.stream().count();

            nSwap ++;
        }

        return nSwap;
    }

    private static void addRemoveProblems(int targetInd, List<Integer> problematics, int[] nums) {
        if (targetInd == nums[targetInd]) {
            problematics.add(targetInd);
        } else {
            problematics.remove(new Integer(targetInd));
        }

        if (targetInd != nums.length - 1) {
            if (targetInd + 1 == nums[targetInd + 1]) {
                problematics.add(targetInd + 1);
            } else {
                problematics.remove(new Integer(targetInd + 1));
            }
        }

        if (targetInd != 0) {
            if (targetInd - 1 == nums[targetInd - 1]) {
                problematics.add(targetInd - 1);
            } else {
                problematics.remove(new Integer(targetInd - 1));
            }
        }
    }

    private static int score(int[] nums, int i) {
        return Math.abs(i - nums[i]);
    }

    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
//        tests();

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] nums = new int[n];
        String[] numsStr = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i ++) {
            nums[i] = Integer.parseInt(numsStr[i]);
        }

        System.out.println(solve(n, nums));
    }

    private static String ex1 = "5\n1 4 3 5 2";
    private static String ex2 = "2\n1 2";
    private static String ex3 = "2\n2 1";
    private static String ex4 = "9\n1 2 4 9 5 8 7 3 6";

    private static void tests() {
        System.out.println(solve(5, new int[]{1, 4, 3, 5, 2}));
        System.out.println(solve(2, new int[]{1, 2}));
        System.out.println(solve(2, new int[]{2, 1}));
        System.out.println(solve(9, new int[]{1, 2, 4, 9, 5, 8, 7, 3, 6}));
    }
}