import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        char[] charArr = sc.next().toCharArray();

        Map<Character, Integer> diffMap = new HashMap<>();
        Map<Character, Integer> diffMinMap = new HashMap<>();
        Map<Character, Integer> diffMaxMap = new HashMap<>();

        Map<Character, List<Integer>> golems = new HashMap<>();

        for (int i = 0; i < q; i++) {
            char t = sc.next().toCharArray()[0];
            char d = sc.next().toCharArray()[0];
            int diff = diffMap.getOrDefault(t, 0);
            int diffMin = diffMinMap.getOrDefault(t, 0);
            int diffMax = diffMaxMap.getOrDefault(t, 0);
            if (d == 'L') {
                diff--;
                diffMin = Math.min(diffMin, diff);
                diffMinMap.put(t, diffMin);
            } else {
                diff++;
                diffMax = Math.max(diffMax, diff);
                diffMaxMap.put(t, diffMax);
            }
            diffMap.put(t, diff);
        }


        int sum = 0;
        for (char c : diffMap.keySet()) {
            int min = Math.abs(diffMinMap.get(c));
            int max = Math.abs(diffMaxMap.get(c));
            int count = 0;
            for (int i = 0; i < min; i++) {
                if (charArr[i] == c) count++;
            }
            for (int i = n - 1; i > n - max - 1; i--) {
                if (charArr[i] == c) count++;
            }
            sum += count;
        }

        System.out.println(n - sum);


    }
}
