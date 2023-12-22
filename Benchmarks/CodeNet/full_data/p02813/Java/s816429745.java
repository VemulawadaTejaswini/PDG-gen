import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int[] p = new int[n];
        int[] q = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = std.nextInt();
        }

        for (int i = 0; i < n; i++) {
            q[i] = std.nextInt();
        }

        int[] sortedP = Arrays.copyOf(p, p.length);
        Arrays.sort(sortedP);
        int[] sortedQ = Arrays.copyOf(q, q.length);
        Arrays.sort(sortedQ);

        List<List<Integer>> listP = new ArrayList<>();
        backtrack(listP, new ArrayList<>(), sortedP);

        List<List<Integer>> listQ = new ArrayList<>();
        backtrack(listQ, new ArrayList<>(), sortedQ);

        int indexP = matchedIndex(listP, p);
        int indexQ = matchedIndex(listQ, q);
        int ans = Math.abs(indexP - indexQ);
        System.out.println(ans);
    }

    static int matchedIndex(List<List<Integer>> list, int[] nums) {
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            List<Integer> elements = list.get(i);
            boolean isMatched = true;
            for (int j = 0; j < elements.size(); j++) {
                int listValue = elements.get(j);
                if (listValue != nums[j]) {
                    isMatched = false;
                    break;
                }
            }

            if (isMatched) {
                index = i;
            }
        }

        return index;
    }

    static void backtrack(List<List<Integer>> out, List<Integer> tmpList, int[] nums) {
        if (tmpList.size() == nums.length) {
            out.add(new ArrayList<>(tmpList));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (tmpList.contains(nums[i])) {
                    continue;
                }

                tmpList.add(nums[i]);
                backtrack(out, tmpList, nums);
                tmpList.remove(tmpList.size() - 1);
            }
        }
    }
}
