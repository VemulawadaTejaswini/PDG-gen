import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] S = new String[N];
        int[] P = new int[N];
        for (int i=0; i<N; i++) {
            S[i] = sc.next();
            P[i] = sc.nextInt();
        }

        List<Item> ans = solve(N, S, P);
        for (int i=0; i<N; i++) {
            System.out.println(ans.get(i).index);
        }
    }

    private static List<Item> solve(int N, String[] S, int[] P) {
        List<Item> ans = new ArrayList<>();

        for (int i=0; i<N; i++) {
            ans.add(new Item(S[i], P[i], i+1));
        }

        Collections.sort(ans);

        return ans;
    }

    static class Item implements Comparable<Item> {
        String city;
        int score;
        int index;
        public Item(String city, int score, int index) {
            this.city = city;
            this.score = score;
            this.index = index;
        }

        public int compareTo(Item item) {
            if (!city.equals(item.city)) {
                return city.compareTo(item.city);
            }

            return item.score - score;
        }
    }
}
