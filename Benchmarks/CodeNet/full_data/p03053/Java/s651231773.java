import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();
        sc.nextLine();

        boolean A[][] = new boolean[H][W];
        Set<Pos> posSet = new HashSet<>();

        for (int i = 0; i < H; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < W; j++) {
                boolean b = (line.charAt(j) == '#');
                A[i][j] = b;
                if (!b) {
                    posSet.add(new Pos(i, j));
                }
            }
        }

        int count = 0;
        while(!posSet.isEmpty()) {
            count++;
            Set<Pos> removeSet = new HashSet<>();

            Iterator<Pos> iterator = posSet.iterator();
            while(iterator.hasNext()) {
                Pos next = iterator.next();
                if (
                        (next.j < W - 1 && A[next.i][next.j + 1]) ||
                        (next.i < H - 1 && A[next.i + 1][next.j]) ||
                        (next.j > 0 && A[next.i][next.j - 1]) ||
                        (next.i > 0 && A[next.i - 1][next.j])
                ) {
                    removeSet.add(next);
                }
            }

            Iterator<Pos> iterator1 = removeSet.iterator();
            while(iterator1.hasNext()) {
                Pos next = iterator1.next();
                A[next.i][next.j] = true;
            }

            posSet.removeAll(removeSet);
        }

        System.out.println(count);
    }

    public static class Pos {
        public int i;
        public int j;

        public Pos(int i, int j) {
            this.i = i;
            this.j = j;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pos pos = (Pos) o;
            return i == pos.i &&
                    j == pos.j;
        }

        @Override
        public int hashCode() {
            return Objects.hash(i, j);
        }
    }
}
