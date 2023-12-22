import static java.util.Comparator.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

final class Star {
    public final int x;
    public final int y;
    public Star(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

}

class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        Star[] redStars = new Star[n];
        Star[] blueStars = new Star[n];
        for (int i = 0; i < n; i++) {
            redStars[i] = new Star(cin.nextInt(), cin.nextInt());
        }
        for (int i = 0; i < n; i++) {
            blueStars[i] = new Star(cin.nextInt(), cin.nextInt());
        }

        int count = countPair(sortByY(redStars), sortByX(blueStars));

        System.out.println(count);
    }

    static Star[] sortByX(Star[] stars) {
        return Arrays.asList(stars).stream()
                .sorted(comparing(Star::getX))
                .toArray(Star[]::new);
    }

    static Star[] sortByY(Star[] stars) {
        return Arrays.asList(stars).stream()
            .sorted(comparing(Star::getY))
            .toArray(Star[]::new);
    }

    static int countPair(Star[] sortedRedStars, Star[] sortedBlueStars) {
        int count = 0;
        List<Star> sortedRedBuf = new ArrayList<Star>(Arrays.asList(sortedRedStars));
        for (Star blue : sortedBlueStars) {
            Star pairdRed = null;
            for (Star red : sortedRedBuf) {
                if (red.x < blue.x && red.y < blue.y) {
                    pairdRed = red;
                }
            }
            if (pairdRed != null) {
                count++;
                sortedRedBuf.remove(pairdRed);
            }
        }
        return count;
    }
}