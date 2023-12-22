import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Read
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        boolean a[][] = new boolean[h][w];

        // Preproc
        Queue<Coord> queue = new ArrayDeque<>();
        String tmp;

        for (int i=0; i<h; i++) {
            tmp = sc.next();
            for (int j=0; j<w; j++) {

                if (tmp.charAt(j) == '#') {
                    a[i][j] = true;
                    queue.add(new Coord(i,j));
                }

            }
        }

        Coord dummy = new Coord(0,0);
        dummy.isDummy = true;
        queue.add(dummy);

        // Counting
        int result = 0;

        while (!queue.isEmpty()) {
            Coord c = queue.remove();
            if (!c.isDummy) {
                for(Coord n : neighbours(c, h-1, w-1)){
                    if(!a[n.x][n.y]) {
                        a[n.x][n.y] = true;
                        queue.add(n);
                    }
                }
            } else {
                if (queue.isEmpty()) {
                    break;
                }
                queue.add(dummy);
                result++;
            }
        }

        System.out.println(result);


    }

    private static List<Coord> neighbours(Coord c, int uBoundX, int uBoundY) {
        List<Coord> r = new ArrayList<>(4);
        if (c.x-1 >= 0) {r.add(new Coord(c.x-1,c.y));}
        if (c.y-1 >= 0) {r.add(new Coord(c.x,c.y-1));}
        if (c.x+1 <= uBoundX) {r.add(new Coord(c.x+1,c.y));}
        if (c.y+1 <= uBoundY) {r.add(new Coord(c.x,c.y+1));}
        return r;
    }


    static class Coord {
        boolean isDummy = false;
        int x; int y;
        Coord(int x, int y){
            this.x = x;
            this.y = y;
        };
    }

}

