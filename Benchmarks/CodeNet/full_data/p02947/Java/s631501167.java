import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String[] words = new String[N];
        for (int i = 0; i < words.length; i++) words[i] = in.next();

        Map<String, Integer> cnt = new HashMap<>();
        for (String word : words) {
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String sorted = String.valueOf(arr);
            cnt.put(sorted, cnt.getOrDefault(sorted, 0) + 1);
        }
        int res = 0;
        for (Integer i : cnt.values())
            res += i * (i - 1) / 2;
        System.out.println(res);

    }

    private static int[] count(String S) {
        int[] cnt = new int[26];
        for (Character c : S.toCharArray())
            cnt[(int) c - 97]++;
        return cnt;
    }

    private static boolean checkAnagram(int[] A, int[] B) {
        if (A.length != B.length) return false;
        for (int i = 0; i < A.length; i++)
            if (A[i] != B[i]) return false;
        return true;
    }

}
