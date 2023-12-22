

import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        if (x >= 1 && x <= 100 && y >= 1 && y <= 100) {
            if (x - (y * 2) >= 0) {
                System.out.println(x - (y * 2));
            } else {
                System.out.println(0);
            }
        }
    }
}
