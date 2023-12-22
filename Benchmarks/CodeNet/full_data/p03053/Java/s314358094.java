import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        // Read
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
        String[] s = br.readLine().split("\\s+");
        int h = Integer.parseInt(s[0]);
        int w = Integer.parseInt(s[1]);

        // Preproc
        List<Integer> qX = new LinkedList<>();
        List<Integer> qY = new LinkedList<>();
        boolean a[][] = new boolean[h][w];
        String tmp;
        Integer whitesCount = h*w;

        for (int i=0; i<h; i++) {
            tmp = br.readLine();
            for (int j=0; j<w; j++) {

                if (tmp.charAt(j) == '#') {
                    a[i][j] = true;
                    qX.add(i);
                    qY.add(j);
                    whitesCount--;
                }

            }
        }

        // Counting
        int result = 0;

        while (whitesCount > 0) {
            List<Integer> nX = new LinkedList<>();
            List<Integer> nY = new LinkedList<>();

            Iterator<Integer> itQX = qX.iterator();
            Iterator<Integer> itQY = qY.iterator();
            int x; int y;
            while (itQX.hasNext() && itQY.hasNext()) {
                x = itQX.next(); y = itQY.next();
                if (x-1 >= 0)   {if(!a[x-1][y]){neighboursFill(x-1,y,a,nX,nY);whitesCount--;}}
                if (y-1 >= 0)   {if(!a[x][y-1]){neighboursFill(x,y-1,a,nX,nY);whitesCount--;}}
                if (x+1 <= h-1) {if(!a[x+1][y]){neighboursFill(x+1,y,a,nX,nY);whitesCount--;}}
                if (y+1 <= w-1) {if(!a[x][y+1]){neighboursFill(x,y+1,a,nX,nY);whitesCount--;}}
            }
            qX = nX; qY = nY;

            result++;
        }

        System.out.println(result);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    private static void neighboursFill (int x, int y, boolean[][] a,
                                        List<Integer> xList, List<Integer> yList) {
            a[x][y] = true;
            xList.add(x); yList.add(y);
    }

    static class Coord {
        int x; int y;
        Coord(int x, int y){
            this.x = x;
            this.y = y;
        };
    }

}

