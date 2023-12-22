import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Read
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        Coord lBound = new Coord(0,0);
        Coord uBound = new Coord(h-1,w-1);

        // Preproc
        Queue<Coord> queue = new LinkedList<>();
        boolean a[][] = new boolean[h][w];
        String tmp;
        int whitesCount = h*w;

        for (int i=0; i<h; i++) {
            tmp = sc.next();
            for (int j=0; j<w; j++) {

                if (tmp.charAt(j) == '#') {
                    a[i][j] = true;
                    queue.add(new Coord(i,j));
                    whitesCount--;
                } else {
                    a[i][j] = false;
                }

            }
        }

        // Counting
        int result = 0;

        while (whitesCount > 0) {

            Queue<Coord> next = new LinkedList<>();
            for (Coord c : queue) {
                for(Coord n : neighbours(c, lBound, uBound)){
                    if(!a[n.x][n.y]) {
                        a[n.x][n.y] = true;
                        next.add(n);
                        whitesCount--;
                    }
                }
            }
            queue = next;

            result++;
        }

        System.out.println(result);


    }

    private static List<Coord> neighbours(Coord c, Coord lBound, Coord uBound) {
        List<Coord> r = new LinkedList<>();
        if (c.x-1 >= lBound.x) {r.add(new Coord(c.x-1,c.y));}
        if (c.y-1 >= lBound.y) {r.add(new Coord(c.x,c.y-1));}
        if (c.x+1 <= uBound.x) {r.add(new Coord(c.x+1,c.y));}
        if (c.y+1 <= uBound.y) {r.add(new Coord(c.x,c.y+1));}
        return r;
    }

    static class Coord {
        int x;
        int y;
        Coord (int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}

