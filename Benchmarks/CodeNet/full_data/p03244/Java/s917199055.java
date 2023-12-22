import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] seq = new int[n];

        for (int i = 0; i < n; i++) {
            seq[i] = sc.nextInt();
        }

        Map<Integer, Integer> evenBucket = new HashMap<>(); // ここでのeven/oddはインデックス基準, zero-based
        Map<Integer, Integer> oddBucket = new HashMap<>();

        // 後の全探索で「全部数字が同じ」ケースをさばくために、存在しない-1を0件として追加しておく
        evenBucket.put(-1, 0);
        oddBucket.put(-1, 0);
        for (int i = 0; i < n; i += 2) {
            if (evenBucket.containsKey(seq[i])) {
                evenBucket.put(seq[i], evenBucket.get(seq[i]) + 1);
            } else {
                evenBucket.put(seq[i], 1);
            }
        }

        for (int i = 1; i < n; i += 2) {
            if (oddBucket.containsKey(seq[i])) {
                oddBucket.put(seq[i], oddBucket.get(seq[i]) + 1);
            } else {
                oddBucket.put(seq[i], 1);
            }
        }

        List<Map.Entry<Integer, Integer>> evenBucketEntries = new ArrayList<>(evenBucket.entrySet());
        Collections.sort(evenBucketEntries, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> obj1, Map.Entry<Integer, Integer> obj2) {
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });


        List<Map.Entry<Integer, Integer>> oddBucketEntries = new ArrayList<>(oddBucket.entrySet());
        Collections.sort(oddBucketEntries, new Comparator<Map.Entry<Integer, Integer>>() {
           public int compare(Map.Entry<Integer, Integer> obj1, Map.Entry<Integer, Integer> obj2) {
               return obj2.getValue().compareTo(obj2.getValue());
           }
        });

        // スコアを最大化するよう全探索する
        int score = -1;
        for (int i_even = 0; i_even < evenBucketEntries.size(); i_even++) {
            for (int i_odd = 0; i_odd < oddBucketEntries.size(); i_odd++) {
                if (evenBucketEntries.get(i_even).getKey() == oddBucketEntries.get(i_odd).getKey()) {
                    continue;
                }
                int newScore = evenBucketEntries.get(i_even).getValue() + oddBucketEntries.get(i_odd).getValue();
                if (newScore > score) {
                    score = newScore;
                }
            }
        }

        System.out.println(n - score);
    }
}