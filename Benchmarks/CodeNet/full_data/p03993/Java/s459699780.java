import java.util.*;

public class Main {

    private static class Pair {
        int x;
        int y;


        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null)
                return false;
            Pair other = (Pair) obj;
            if (this.x == other.x && this.y == other.y)
                return true;
            return this.x == other.y && this.y == other.x;
        }

        public int hashCode() {
            return x + y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfPairs = sc.nextInt();
        List<Integer> lovedOnes = new ArrayList<>();
        for (int i = 0; i < numberOfPairs; i++) {
            lovedOnes.add(sc.nextInt());
        }
        List<Pair> pairs = new ArrayList<>();
        for (int i = 1; i <= numberOfPairs; i++) {
            pairs.add(new Pair(i, lovedOnes.get(i - 1)));
        }
        Set<Pair> pairsSet = new HashSet<>(pairs);
        System.out.println(numberOfPairs - pairsSet.size());
    }
}