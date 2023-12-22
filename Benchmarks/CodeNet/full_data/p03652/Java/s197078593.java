import java.util.*;
import java.util.stream.IntStream;

public class Main {
    static int length = 2 * (int)1e9 + 1;
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int N =scan.nextInt();
        int M =scan.nextInt();

        List<Queue<Integer>> A = new ArrayList<>(N);
        for (int i : IntStream.range(0, N).toArray()){
            Queue<Integer> tmp = new ArrayDeque<>(M);
            for (int j :IntStream.range(0, M).toArray()){
                tmp.add(scan.nextInt() - 1);
            }
            A.add(tmp);
        }
        int[] players = new int[M];
        int[] playerLikes = new int[M];
        for (int j :IntStream.range(0, N).toArray()){
            int like = A.get(j).poll();
            players[like]++;
            playerLikes[j] = like;
        }
        int popular = maxIndex(players);
        int score = max(players);
        for (int i :IntStream.range(1, M).toArray()){
            popular = maxIndex(players);
            players[popular] = 0;
            for (int j :IntStream.range(0, N).toArray()){
                if(playerLikes[j] == popular) {
                    int like = A.get(j).poll();
                    players[like]++;
                    playerLikes[j] = like;
                }
            }
            score = Math.min(score, max(players));
        }
        System.out.println(score);
    }

    static int max(int[] a) {
        int max = 0;
        for (int tmp : a) {
            max = Math.max(max, tmp);
        }
        return max;
    }

    static int maxIndex(int[] a) {
        int max = 0;
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                index = i;
            }
        }
        return index;
    }

    static class Like {
        int name;
        int prime;

        public Like(int name, int prime) {
            this.name = name;
            this.prime = prime;
        }
    }
}
