import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    private static class Pos
    {
        private final int x;
        private final int y;

        Pos(int x, int y)
        {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o)
        {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Pos)) {
                return false;
            }

            Pos pos = (Pos) o;

            if (x != pos.x) {
                return false;
            }
            return y == pos.y;
        }

        @Override
        public int hashCode()
        {
            int result = x;
            result = 31 * result + y;
            return result;
        }
    }

    private static class Elm
    {
        private final Pos pos;
        private final Elm prev;

        Elm(Pos pos, Elm prev)
        {
            this.pos = pos;
            this.prev = prev;
        }

        Elm(int x, int y, Elm prev)
        {
            this(new Pos(x, y), prev);
        }

        int x()
        {
            return pos.x;
        }

        int y()
        {
            return pos.y;
        }

        List<Pos> history()
        {
            List<Pos> hist = new ArrayList<>();
            Elm e = this;
            while (true) {
                hist.add(e.pos);
                if (e.prev == null) {
                    return hist;
                }
                e = e.prev;
            }
        }
    }

    private static boolean isValidPos(int h, int w, Pos pos)
    {
        return pos.x >= 0 && pos.x <= w -1 && pos.y >= 0 && pos.y <= h - 1;
    }

    public static void main(String[] args)
            throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] map = new int[h][w];
        int spaces = 0;
        for (int i = 0; i < h; i++) {
            char[] line = sc.next().toCharArray();
            for (int j = 0; j < w; j++) {
                map[i][j] = line[j] == '.' ? Integer.MAX_VALUE : line[j];
                if (map[i][j] == Integer.MAX_VALUE) {
                    spaces++;
                }
            }
        }

        List<Pos> shortestHistory = null;
        LinkedList<Elm> queue = new LinkedList<>();
        queue.add(new Elm(0, 0, null));
        while (!queue.isEmpty()) {
            Elm elm = queue.removeFirst();
            List<Pos> history = elm.history();
            int cost = elm.history().size();
            int field = map[elm.y()][elm.x()];
            if (cost < field) {
                map[elm.y()][elm.x()] = cost;
            }
            else {
                continue;
            }

            if (elm.x() == w - 1 && elm.y() == h - 1) {
                if (shortestHistory == null) {
                    shortestHistory = history;
                }
                else if (history.size() < shortestHistory.size()) {
                    shortestHistory = history;
                }
            }
            else {
                for (Pos next : new Pos[] {
                        new Pos(elm.x() - 1, elm.y()),
                        new Pos(elm.x() + 1, elm.y()),
                        new Pos(elm.x(), elm.y() - 1),
                        new Pos(elm.x(), elm.y() + 1) }) {

                    if (isValidPos(h, w, next) && map[next.y][next.x] != '#' && !history.contains(next)) {
                        queue.add(new Elm(next, elm));
                    }
                }
            }
        }

        if (shortestHistory == null) {
            System.out.println(-1);
        }
        else {
            System.out.println(spaces - shortestHistory.size());
        }
    }
}
